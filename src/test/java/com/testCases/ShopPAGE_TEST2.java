package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.PageObjects.ACCOUNT_CREATIONS;
import com.PageObjects.MY_StorePAGE;
import com.PageObjects.MyStore_LOGIN;
import com.Utilities.EXcelUtilities;

public class ShopPAGE_TEST2 extends BaseTest {
	String filepath12 = System.getProperty("user.dir")+ "\\EXcel\\newautomation.xlsx";
	
	
	@Test
	public void TESTPAGE2() throws IOException, InterruptedException {
		
		 EXcelUtilities excel_1234 = new EXcelUtilities();
		String celldata =  excel_1234.getCellData(filepath12, "Sheet1", 1, 0);
		System.out.println(celldata);
		
		
		
		int row = excel_1234.getRowCount(filepath12,"Sheet1" );
		System.out.println(row);
	String celldata1 = 	excel_1234.getCellData(filepath12, "Sheet1", 1, 0);
	System.out.println(celldata1);
	String celldata2 = 	excel_1234.getCellData(filepath12, "Sheet1", 2, 0);
	System.out.println(celldata2);
	String celldata3 = 	excel_1234.getCellData(filepath12, "Sheet1", 3, 0);
	System.out.println(celldata3);
	String celldata4 = 	excel_1234.getCellData(filepath12, "Sheet1", 4, 0);
	System.out.println(celldata4);
	
	int rowcount = excel_1234.getRowCount(filepath12, "Sheet1");
	System.out.println(rowcount);
	
	int ROWES=3;
	for (int i =2;i<=ROWES ;i++) {
		 driver.get(NEW_URL1);
		 MY_StorePAGE storepage = new MY_StorePAGE(driver);
		 storepage.SIGNBUTTON();
		
		 MyStore_LOGIN looo = new MyStore_LOGIN(driver);
		 
	   String USERID = excel_1234.getCellData(filepath12, "Sheet1", i,0);
	 String PASSWORD = excel_1234.getCellData(filepath12, "Sheet1",i, 1);
	 looo.ENTER_EMAIL(USERID);
	 looo.CLICKBUTTON();
	 Thread.sleep(3000);
	 ACCOUNT_CREATIONS logPAGE = new ACCOUNT_CREATIONS(driver);
	 logPAGE.CLICK_McRs_MIs();
	 logPAGE.ENTER_FIRSSTNAME(FIRST_NAME);
	 logPAGE.ENTER_LASRNAME(LAST_NAME);
	 logPAGE.ENTER_PASSWORD(SHOP_PASSWORD);
	 logPAGE.CLICKbutton();
	 logPAGE.REGISTERBUTTON_CLICK();
	 Thread.sleep(2000);
	 
	 logPAGE.LOGOUT();
	 Thread.sleep(3000);
	 
		}
	



	}
  
}
