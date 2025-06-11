package com.test.ui.actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.test.driverfactory.DriverFactory;

public class BaseTest {
	

	public static WebDriver driver;
	DriverFactory df;
	static boolean flag=true;
	
	
	@Parameters("Browser")
	@BeforeClass
	@BeforeTest
	public  void setUp(String Browser) {
		df=new DriverFactory();
		driver=df.initDriver(Browser);
	}
	
	@AfterTest
	public static void closeBrowser() {
		// driver.close();
		 driver.quit();
	}
}



