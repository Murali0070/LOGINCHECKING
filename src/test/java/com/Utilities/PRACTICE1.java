package com.Utilities;

import java.io.IOException;

import org.testng.annotations.Test;

public class PRACTICE1 {
	/*
	@Test
	public void testExcel() {
    try
    {
    String excelPath = System.getProperty("user.dir") + "\\Exceldata\\AutomationDATA.xlsx";
    NEW_ExcelReader object1 = new NEW_ExcelReader(excelPath,"Sheet1");
    String USER_cell =object1.getCellData(excelPath,3, 0);
    String USERPASSWORD = object1.getCellData(excelPath, 3, 1); 
System.out.println(USER_cell +  USERPASSWORD);
    }
    catch(IOException e) 
    {
    	e.printStackTrace();
    }
    
}*/
	
	String filepath = System.getProperty("user.dir")+"\\Exceldata\\newautomation.xlsx";
	  
	 
	@Test
	public  void gettingexceldata() throws IOException {
		EXcelUtilities excel_1234 = new EXcelUtilities();
		int row = excel_1234.getRowCount(filepath,"Sheet1" );
		System.out.println(row);
	String celldata1 = 	excel_1234.getCellData(filepath, "Sheet1", 1, 0);
	System.out.println(celldata1);
	String celldata2 = 	excel_1234.getCellData(filepath, "Sheet1", 2, 0);
	System.out.println(celldata2);
	String celldata3 = 	excel_1234.getCellData(filepath, "Sheet1", 3, 0);
	System.out.println(celldata3);
	String celldata4 = 	excel_1234.getCellData(filepath, "Sheet1", 4, 0);
	System.out.println(celldata4);
	
	int rowcount = excel_1234.getRowCount(filepath, "Sheet1");
	System.out.println(rowcount);



	

	}
	
	
}