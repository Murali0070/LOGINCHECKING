package com.testCases;

import java.io.IOException;

import org.checkerframework.checker.units.qual.Acceleration;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.ACCOUNT_CREATIONS;
import com.PageObjects.MY_StorePAGE;
import com.PageObjects.MyStore_LOGIN;
import com.Utilities.NEW_ExcelReader;
import com.Utilities.SimpleExcelReader;

public class MY_ShopPAGE_TEST extends BaseTest {
@Test
	public void SHOPWEBPAGE_TEST() throws InterruptedException {
	driver.get(NEW_URL1);Thread.sleep(3000);
	MY_StorePAGE storepage = new MY_StorePAGE(driver);
	
	storepage.SIGNBUTTON();Thread.sleep(3000);
     
	MyStore_LOGIN MyStore_login = new MyStore_LOGIN(driver);
	
	String USER_cell = null;
	String USERPASSWORD = null ;
	
	try
    {
    String excelPath = System.getProperty("user.dir") + "\\Exceldata\\AutomationDATA.xlsx";
    NEW_ExcelReader object1 = new NEW_ExcelReader(excelPath,"Sheet1");
     USER_cell =object1.getCellData(excelPath,3, 0);
     USERPASSWORD = object1.getCellData(excelPath, 3, 1); 
System.out.println(USER_cell +  USERPASSWORD);
    }
    catch(IOException e) 
    {
    	e.printStackTrace();
    }
	
	
	MyStore_login.ENTER_EMAIL(USER_cell);
	
	

	MyStore_login.CLICKBUTTON();
	Thread.sleep(3000);
	
	ACCOUNT_CREATIONS ACCOUNT_creations = new ACCOUNT_CREATIONS(driver);
	Thread.sleep(3000);
	ACCOUNT_creations.CLICK_McRs_MIs();
	ACCOUNT_creations.ENTER_FIRSSTNAME(FIRST_NAME);
	ACCOUNT_creations.ENTER_LASRNAME(LAST_NAME);
//	ACCOUNT_creations.ENTER_EMAIL(SHOP_EMAIL);
	ACCOUNT_creations.ENTER_PASSWORD(USERPASSWORD);
	ACCOUNT_creations.CLICKbutton();
	ACCOUNT_creations.REGISTERBUTTON_CLICK();
	Thread.sleep(10000);
	
	
/*	String username ;
	
	if(username.equals("Manu dasari")) 
	{
		Assert.assertTrue(true);
	}
	else 
	{
		Assert.assertTrue(false);
	}
	
	*/
	
	

	}
}

	

