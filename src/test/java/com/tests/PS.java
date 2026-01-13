package com.tests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PS {
	
	static String Name1="Tushar";
	
	static String Name2="Sada";

	static String Name3="Sam";

	static String Name4="Datta";

	static String Name5="Asif";


	public static void main(String[] args) {
		
		 Setter("","Masne");
		 String MySN = Getter("SN");
		 
		 System.out.println(MySN);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/header/div[6]/a")).click();

		//Setter(mytext,"");
		
	}
	
	
	public static  HashMap<String, String> hm=new HashMap<String, String>();
	public static HashSet <String> hl=new HashSet<String>();
	

	 /**
	  * Author Tushar
	  * Date--23/08/2025
	  * Description--function can be used for setting varaibles
	  * @param x
	  * @param y
	  * @return
	  */
	public static String Setter(String x , String y) {
		String z = y;
		hm.put(x,y);
		//hl.add()
		return x;
	}
	
	public static String Getter(String x) {
		return hm.get(x);
	}
	
	public static void Capture_Strings_AddInSetter_And_Write_Getter() {
		
		
	}
	



}
