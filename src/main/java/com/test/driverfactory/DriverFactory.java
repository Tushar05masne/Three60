package com.test.driverfactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import utility.ReadProperties;

public class DriverFactory {

	// WebDriver driver=new ChromeDriver();
	// private static String Browser = "chrome";
	public static WebDriver driver;
	static boolean flag = true;
	public static String remote = null;
	public static String hubURL = null;

	public WebDriver initDriver(String Browser) throws IOException {

		ReadProperties rp = new ReadProperties();
		remote = rp.getConfigProperty("remote");
		hubURL = rp.getConfigProperty("hubURL");
		System.out.println(remote);

		switch (Browser.trim().toLowerCase()) {

		case ("chrome"):
			if (Boolean.parseBoolean(remote)) {

				// driver=new RemoteWebDriver();
				initRemoteWebDriver(Browser);
			} else {
				driver = new ChromeDriver();
				System.out.println("Launched browser is=" + Browser);
			}
			break;
		case ("safari"):
			if (Boolean.parseBoolean(remote)) {

				// driver=new RemoteWebDriver();
				initRemoteWebDriver(Browser);
			}else {
			driver = new SafariDriver();
			System.out.println("Launched browser is=" + Browser);
			}
			break;
		case ("edge"):
			if (Boolean.parseBoolean(remote)) {

				// driver=new RemoteWebDriver();
				initRemoteWebDriver(Browser);
			}else {
			driver = new EdgeDriver();
			System.out.println("Launched browser is=" + Browser);
			}
			break;
		case ("firefox"):
			if (Boolean.parseBoolean(remote)) {

				// driver=new RemoteWebDriver();
				initRemoteWebDriver(Browser);
			}else {
			driver = new FirefoxDriver();
			System.out.println("Launched browser is=" + Browser);
			}
			break;
		default:
			System.out.println("Please pass the right browser.........");
			flag = false;
			break;
		}

		if (flag) {
			driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
			// String Title = driver.getTitle();
			// System.out.println("Title is ="+Title);
		}
		return driver;

	}

	private void initRemoteWebDriver(String Browser) throws MalformedURLException {

		switch (Browser.toLowerCase().trim()) {

		case ("chrome"):

			ChromeOptions Coptions = new ChromeOptions();
		
			Coptions.addArguments("--disable-gpu");
			Coptions.addArguments("--no-sandbox");

		 //   Coptions.setCapability(Browser, "chrome");
			driver = new RemoteWebDriver(new URL(hubURL), Coptions);
			break;
		case ("edge"):
			EdgeOptions Eoptions = new EdgeOptions();
			driver = new RemoteWebDriver(new URL(hubURL), Eoptions);
			break;

		case ("firefox"):
			FirefoxOptions ffoptions = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL(hubURL), ffoptions);
			break;
		default:
			System.out.println("Wrong browser name");

		}
	}
}
