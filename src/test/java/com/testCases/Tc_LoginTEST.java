package com.testCases;



import org.testng.annotations.Test;

import com.PageObjects.LoginPage;

public class Tc_LoginTEST extends BaseTest {
	
	@Test
	public void login()
	{
		driver.get(wwebsiteURl);
		//LoginPage lp =new LoginPage(driver);
		//lp.setUserName(userNAME);
		//LoginPage.setUserName(userNAME);
		//lp.setPassword(passwd);
		
		//lp.Clickbutton();
		
	} 
}
