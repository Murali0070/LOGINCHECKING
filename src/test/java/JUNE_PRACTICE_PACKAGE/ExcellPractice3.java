package JUNE_PRACTICE_PACKAGE;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellPractice3 {

	
	
	
	
	
	    public static void main(String[] args) throws Exception {
	        File file = new File(System.getProperty("user.dir") + "\\Exceldata\\newautomation.xlsx");
	        FileInputStream fis = new FileInputStream(file);
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet("Sheet1");

	        DataFormatter dataFormatter = new DataFormatter();
	        int rowCount = sheet.getPhysicalNumberOfRows();

	        for (int i = 0; i < rowCount; i++) {
	            XSSFRow row = sheet.getRow(i);

	            if (row != null) {
	                int cellCount = row.getPhysicalNumberOfCells();

	                for (int j = 0; j < cellCount; j++) {
	                    XSSFCell cell = row.getCell(j);
	                    String cellValue = dataFormatter.formatCellValue(cell);
	                    System.out.println(cellValue );
	                }
	                System.out.println();
	            }
	        }
	        

	        workbook.close();
	        fis.close();
	    }
	     
	}

	
