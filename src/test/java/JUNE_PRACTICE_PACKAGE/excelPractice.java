package JUNE_PRACTICE_PACKAGE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelPractice {

static String filepath = System.getProperty("user.dir") + "\\EXcel\\1086151 SUMOTO FINAL REMARKS FOR 159.xlsx";
public static void GettingCELLdata(String pathofFile,String SheetName,int RowStart,int columnStart) throws Exception {
	
	 File file = new File(pathofFile);
     FileInputStream fis = new FileInputStream(file);
     XSSFWorkbook workbook = new XSSFWorkbook(fis);
     XSSFSheet sheet = workbook.getSheet(SheetName);

     DataFormatter dataFormatter = new DataFormatter();
     int rowCount = sheet.getPhysicalNumberOfRows();

     for (int i = RowStart; i < rowCount; i++) {
         XSSFRow row = sheet.getRow(i);

         if (row != null) {
             int cellCount = row.getPhysicalNumberOfCells();

             for (int j = columnStart ; j < cellCount; j++) {
                 XSSFCell cell = row.getCell(j);
                 String cellValue = dataFormatter.formatCellValue(cell);
                 System.out.print(cellValue+"\t" );
             }
             System.out.println();
         }
     }
     workbook.close();
     fis.close();
}
	public static void main(String[] args) throws Exception {

		GettingCELLdata(filepath, "Sheet1", 1, 0);
		
		
	}
}
