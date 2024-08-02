package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata {
	public static void main(String[] args) throws IOException {
	FileInputStream file  = new FileInputStream(System.getProperty("user.dir")+"\\Exceldata\\AutomationDATA.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int totalRows = sheet.getLastRowNum();
	int totalcells = sheet.getRow(1).getLastCellNum();
	System.out.println ("totalrows =" +totalRows);
	System.out.println ("totalcells ="+ totalcells);
	
	  DataFormatter formatter = new DataFormatter();
      String cellData = formatter.formatCellValue(sheet.getRow(2).getCell(1));
      System.out.println("Data from cell (0,1) = " + cellData);

      workbook.close();
	
	}

}
