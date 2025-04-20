package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.ui.actions.BaseTest;

public class Page_Text_Box extends BaseTest{
	
	@FindBy(xpath ="//*[@id='TextForm']//h1") private WebElement TextBox_Form;
	@FindBy(linkText="text-box.php") private WebElement TextBox_Tab;
	////*[@id='fullname']
	@FindBy(id="fullname") private WebElement First_Name;
	@FindBy(id="email") private WebElement Email_ID;
	@FindBy(id="address") private WebElement Current_Address;
	@FindBy(id="password") private WebElement Password;
	
	public Page_Text_Box(WebDriver driver) {		
		PageFactory.initElements(driver, this);	
	}
	 public void Fill_TextBox_Form() throws InterruptedException {
		 
		 TextBox_Tab.click();
		 Thread.sleep(100);
		 TextBox_Form.isDisplayed();
		 First_Name.sendKeys("Tushar Masne");
		 Email_ID.sendKeys("tushar.masne@gmail.com;");
		 Current_Address.sendKeys("Wagholi,Pune");
		 	 
		 Password.sendKeys("12345");
		 
	 }
	
	

}
