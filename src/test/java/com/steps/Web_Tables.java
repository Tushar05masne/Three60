package com.steps;

import com.pages.Page_Web_Tables;
import com.test.ui.actions.BaseTest;

public class Web_Tables extends BaseTest  {
	 
	Page_Web_Tables PageWebTables=new Page_Web_Tables(driver);
	
	public void getTableRows() throws InterruptedException {
		PageWebTables.getTableRows();
	}
	
	

}
