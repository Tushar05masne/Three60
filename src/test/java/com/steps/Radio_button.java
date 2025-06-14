package com.steps;

import com.pages.Page_Radio_Button;
import com.test.driverfactory.DriverFactory;
//import com.test.ui.actions.BaseTest;

public class Radio_button extends DriverFactory  {
	
	Page_Radio_Button ObjRadioButton=new Page_Radio_Button(driver);
	
	public void Operate_radio_Btn() {
		ObjRadioButton.Opearte_RadioButtons();
	}
	
	

}
