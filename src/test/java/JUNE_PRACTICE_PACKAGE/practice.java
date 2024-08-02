package JUNE_PRACTICE_PACKAGE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Utilities.EXcelUtilities;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class practice {
	
	
	public static void main(String[] args) throws IOException 
	{
		
	
String file = (System.getProperty("user.dir")+"\\Exceldata\\newautomation.xlsx");

FileInputStream ss= new FileInputStream(System.getProperty("user.dir")+"\\Exceldata\\newautomation.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(ss);
XSSFSheet sheet = workbook.getSheet("Sheet1");
System.out.println(sheet);
int totalrows = sheet.getLastRowNum();
int totalcolumn = sheet.getRow(0).getLastCellNum();
System.out.println(totalrows);
System.out.println(totalcolumn);

PrintCellData("Sheet1", 1, totalrows, 0, totalcolumn);

}
	
	public static void PrintCellData(String SHEET,int startRow,int endRow,int startcolumn,int endcolumn) throws IOException {
		String file = (System.getProperty("user.dir")+"\\Exceldata\\newautomation.xlsx");		
		FileInputStream excelFile1 = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(excelFile1);
		XSSFSheet sheet = workbook.getSheet(SHEET);
		XSSFRow row1234;
		 DataFormatter dataFormatter = new DataFormatter();
	
		for (int row= startRow; row<=endRow; row++)
		{			
			for (int col =startcolumn; col<=endcolumn;col++)
			{
			String celldata = dataFormatter.formatCellValue(sheet.getRow(row).getCell(col));
			System.out.println("DATAof Row of "+ row +"column of " +col +  celldata);	
			
		    }
		}
		workbook.close();
		excelFile1.close();
		System.out.println();
		
		}

}
