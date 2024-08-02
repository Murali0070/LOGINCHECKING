package com.testCases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.PageObjects.AutomationLoginPage;
import com.PageObjects.MY_StorePAGE;


public class LOGINPAGETEST2 extends BaseTest  {
@Test
	public void verfining() throws Exception {
		// TODO Auto-generated method stub
    String file = System.getProperty("user.dir") + "\\Exceldata\\newautomation.xlsx";

    FileInputStream ss = new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(ss);
    XSSFSheet sheet = workbook.getSheet("Sheet1");

    int totalRows = sheet.getLastRowNum();
    int totalCELLS = sheet.getRow(0).getLastCellNum(); // Changed to getRow(0) to get column count from the first row
    System.out.println("Total Rows: " + totalRows);
    System.out.println("Total Columns: " + totalCELLS);

    // Read user IDs and passwords
    for (int row = 2; row <= 3; row++) 
    {
    	XSSFRow currentRow = sheet.getRow(row);
        if (currentRow != null) {
            DataFormatter dataFormatter = new DataFormatter();
            String cell1Data = dataFormatter.formatCellValue(currentRow.getCell(0));
            String cell2Data = dataFormatter.formatCellValue(currentRow.getCell(1));

            System.out.println("Cell 1 Data: " + cell1Data);
            System.out.println("Cell 2 Data: " + cell2Data);
            
            driver.get(NEW_URL1);
   		 MY_StorePAGE storepage = new MY_StorePAGE(driver);
   		 storepage.SIGNBUTTON();Thread.sleep(2000);
   		
   		AutomationLoginPage login = new AutomationLoginPage(driver);
   		login.enteremailaddress(cell1Data);
   		login.enterpassword(cell2Data);
   		login.SIGHINBUTTON(); Thread.sleep(4000);
   		
   		login.SiGNOUT();
         
        }
        
     }   

}
}   	

