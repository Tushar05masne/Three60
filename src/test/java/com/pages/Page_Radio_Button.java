package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.ui.actions.BaseTest;

public class Page_Radio_Button extends BaseTest {
	
	@FindBy(xpath="//*[text()=' Radio Button']") private WebElement Radio_Button;
	@FindBy(xpath="//h1[text()='Radio Button']") private WebElement Radio_Button_Header;
	@FindBy(xpath="//label[text()='Yes']/preceding::input") private WebElement Yes_Radio;
	
	public Page_Radio_Button(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}

	public void Opearte_RadioButtons() {
		Radio_Button.click();
		Radio_Button_Header.isDisplayed();
		Yes_Radio.click();
	}
}
