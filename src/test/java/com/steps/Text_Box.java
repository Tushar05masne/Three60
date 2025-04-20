package com.steps;

import com.pages.Page_Text_Box;
import com.test.ui.actions.BaseTest;

public class Text_Box extends BaseTest {
	
	Page_Text_Box Obj_Page_Text_Box=new Page_Text_Box(driver);
	
	public void Fill_TextBox_Form() throws InterruptedException {
		Obj_Page_Text_Box.Fill_TextBox_Form();
	}

}
