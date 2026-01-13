package com.tests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;



public class WinApp_testing {
	


	    private static WindowsDriver wdriver = null;
	    private static WebElement result = null;

	    @BeforeClass
	    public static void setup() {
	        try {
	            DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
	            capabilities.setCapability("deviceName", "WindowsPC");

	            
	            //wdriver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);

	        //    wdriver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);
	          //  wdriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	           //result = wdriver.fin
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Test
	    public void testAddition() {
	    	//wdriver.
//	    	wdriver.findElementByName("One").click();
//	    	wdriver.findElementByName("Plus").click();
//	    	wdriver.findElementByName("Seven").click();
//	    	wdriver.findElementByName("Equals").click();

	        //Assert.assertTrue(result.getText().contains("8"));
	    }

	    @AfterClass
	    public static void tearDown() {
	        if (wdriver != null) {
	        	wdriver.quit();
	        }
	    }
	}



