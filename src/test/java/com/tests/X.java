package com.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class X {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // table details
		String username = "SYS as sysdba"; // SQL credentials
		String password = "bye5";

		String query = "select * from sample"; // query to be run
	
		Class.forName("oracle.jdbc.driver.OracleDriver"); // Driver name

		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("Connection Established successfully");
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query); // Execute query
			
			
			
			while(rs.next()) {
			System.out.println(rs.getString("FirstName")+ "  "+rs.getLong(5));
			
		
//			String name = rs.getString("FirstName"); // Retrieve name from db
//			System.out.print(name); // Print result on console
			
			}
			
			st.close(); // close statement
			con.close(); // close connection
			
			System.out.println("Connection Closed....");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/autobdtest","root","KTM@ktm@2022");  
			//here autobdtest is database name, root is username and KTM...password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from sample");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e)
				{ 
				System.out.println(e);
				}  
		}  
	}

	


