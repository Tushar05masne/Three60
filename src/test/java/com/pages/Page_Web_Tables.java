package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.driverfactory.DriverFactory;
import com.test.ui.actions.BaseTest;

public class Page_Web_Tables {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[text()=' Web Tables']") private WebElement WebTable;
	@FindBy(xpath = "//tr") private WebElement rowList;
	@FindBy(xpath="//*[@class='table table-striped mt-3']//tr") private WebElement Table_List;
		
	


	//driver.findElement(By.xpath("//*[@aria-label='Open Menu']"));
	
	public Page_Web_Tables(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		//this.driver=driver;

	}

	
	public void getTableRows() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebTable.click();
		String TableRows = Table_List.getText();
		System.out.println(TableRows);
	}
	

}
