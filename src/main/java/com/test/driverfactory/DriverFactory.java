package com.test.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	//WebDriver driver=new ChromeDriver();
		//private static String Browser = "chrome";
		public static WebDriver driver;
		static boolean flag=true;
		
		public WebDriver initDriver(String Browser) {
		
			 switch(Browser.trim().toLowerCase()) {
			 
			 case("chrome"):
				 driver=new ChromeDriver();
				 System.out.println("Launched browser is="+Browser);
				 break;
			 case("safari"):
				 driver=new SafariDriver();
				 System.out.println("Launched browser is="+Browser);
				 break;
			 case("edge"):
				 driver=new EdgeDriver();
				 System.out.println("Launched browser is="+Browser);
				 break;
			 case("firefox"):
				 driver=new FirefoxDriver();
				 System.out.println("Launched browser is="+Browser);
				 break;
			 default:
				 System.out.println("Please pass the right browser.........");
				 flag = false;
				 break;
			 }
			 
			if(flag) {
			driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
			//String Title = driver.getTitle();
			//System.out.println("Title is ="+Title);
			
			 }
			return driver;

		}
	}
