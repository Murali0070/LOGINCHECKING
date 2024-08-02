package JUNE_PRACTICE_PACKAGE;

	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.apache.poi.ss.usermodel.DataFormatter;


public class excelPractice4 {
	    public static void main(String[] args) throws IOException {
	        String file = System.getProperty("user.dir") + "\\Exceldata\\newautomation.xlsx";

	        FileInputStream ss = new FileInputStream(file);
	        XSSFWorkbook workbook = new XSSFWorkbook(ss);
	        XSSFSheet sheet = workbook.getSheet("Sheet1");

	        int totalRows = sheet.getLastRowNum();
	        int totalColumns = sheet.getRow(0).getLastCellNum(); // Changed to getRow(0) to get column count from the first row
	        System.out.println("Total Rows: " + totalRows);
	        System.out.println("Total Columns: " + totalColumns);

	        // Read user IDs and passwords
	        for (int row = 1; row <= totalRows; row++) {
	        	DataFormatter dataFormatter = new DataFormatter();
		       // dataFormatter.formatCellValue(sheet.getRow(row).getCell(col));
	        	
	            String userId =  dataFormatter.formatCellValue(sheet.getRow(row).getCell(0));
	            String password =  dataFormatter.formatCellValue(sheet.getRow(row).getCell(1));
	            System.out.println("User ID: " + userId + ", Password: " + password);
	        }

	        workbook.close();
	        ss.close();
	    }

	 /*   public static String getCellData(XSSFSheet sheet, int row, int col) {
	        DataFormatter dataFormatter = new DataFormatter();
	        return dataFormatter.formatCellValue(sheet.getRow(row).getCell(col));
	    }*/
	}

	
	
	

