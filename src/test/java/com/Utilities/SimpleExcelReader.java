package com.Utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SimpleExcelReader {
    private XSSFWorkbook workbook;

    public SimpleExcelReader(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
    }

    public String getCellData(String sheetName, int rowNum, int colNum) {
        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
        	return "Sheet not found";
        }
        Row row = sheet.getRow(rowNum);
        if (row==null) {
        	return "row is not found";
        }
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(row.getCell(colNum));
    }

    public void close() throws IOException {
        workbook.close();
    }

    public static void main(String[] args) throws IOException {
		String excelpath1 = System.getProperty(("user.dir")+"//Exceldata//AutomationDATA.xlsx"); 
	
    SimpleExcelReader obje222 = new SimpleExcelReader(excelpath1);
    System.out.println(obje222.getCellData("Sheet1", 0, 1));
    obje222.close();
    }
}

  