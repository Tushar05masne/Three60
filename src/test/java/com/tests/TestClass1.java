package com.tests;

import org.testng.annotations.Test;

import com.steps.Radio_button;
import com.steps.Text_Box;
import com.steps.Web_Tables;
import com.test.driverfactory.DriverFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;



public class TestClass1 {
	


	@Test
	public void TC1() throws InterruptedException {

		Web_Tables wt = new Web_Tables();
		wt.getTableRows();

	}

	  @Test public void TC2() throws InterruptedException {
	  
	  Text_Box TextBoxForm = new Text_Box(); TextBoxForm.Fill_TextBox_Form();
	  
	  System.out.println("Hello TC2 executed");
	  
	  }
	  
	  @Test public void TC3() { Radio_button RadioBtn = new Radio_button();
	  
	  RadioBtn.Operate_radio_Btn();
	  
	  }
	  
	  @Test public void TC4() {
	  
	  System.out.println("TC 4......");
	  
	  }
	 

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}
	@Parameters({"Browser"})
	@BeforeClass
	public void beforeClass(String Browser) {
		//Browser="chrome";
		WebDriver driver;
		DriverFactory df;
		//static boolean flag=true;
		df=new DriverFactory();
		driver=df.initDriver(Browser);
		//initDriver(Browser);
	}

	@AfterClass
	public void afterClass() {
		//closeBrowser();
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
