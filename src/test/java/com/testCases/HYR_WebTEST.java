package com.testCases;

import org.testng.annotations.Test;

import com.PageObjects.HYR_wwebPage;

public class HYR_WebTEST extends BaseTest {
	@Test
	public void caseTest() {
		
	driver.get(NEW_URL);
	HYR_wwebPage h1b = new HYR_wwebPage(driver);
	h1b.FirstName("manohar");
	
}
	
}
