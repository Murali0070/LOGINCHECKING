package com.Utilities;

	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NEW_ExcelReader {
	
	
	    private XSSFWorkbook workbook;
	    private XSSFSheet sheet;

	    public NEW_ExcelReader(String filePath, String sheetName) throws IOException {
	        FileInputStream file = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(file);
	        sheet = workbook.getSheet(sheetName);
	    }

	    public String getCellData(String filePath, int rowNum, int colNum) throws IOException {
	        FileInputStream file = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(file);
	        sheet = workbook.getSheetAt(0); // Assuming you want the first sheet

	        DataFormatter formatter = new DataFormatter();
	        String cellData = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));

	        workbook.close();
	        return cellData;
	    }

	    public void close() throws IOException {
	        workbook.close();
	    }

	 /*   public static void main(String[] args) {
	        try {
	           
	            String excelPath = System.getProperty("user.dir") + "\\Exceldata\\AutomationDATA.xlsx";
	            
	            NEW_ExcelReader reader = new NEW_ExcelReader(excelPath, "Sheet1");
	            String cellData = reader.getCellData(excelPath, 2, 1);
	            System.out.println("Data from cell (2,1) = " + cellData);
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    */
	   
int row= 1;
int column =1;
	   /*
	    public void testExcel() {
	        try
	        {
	        String excelPath = System.getProperty("user.dir") + "\\Exceldata\\AutomationDATA.xlsx";
	        NEW_ExcelReader object1 = new NEW_ExcelReader(excelPath,"Sheet1");
	        String USER_cell =object1.getCellData(excelPath, 4, 0);
	        String USERPASSWORD = object1.getCellData(excelPath, 4, 1); 
	    System.out.println(USER_cell+USERPASSWORD);
	        }
	        catch(IOException e) 
	        {
	        	e.printStackTrace();
	        }
	     */   
	    
}



