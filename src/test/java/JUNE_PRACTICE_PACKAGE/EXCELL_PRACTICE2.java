package JUNE_PRACTICE_PACKAGE;
import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;

		import org.apache.poi.ss.usermodel.CellType;
		import org.apache.poi.xssf.usermodel.XSSFCell;
		import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCELL_PRACTICE2 {

	public static void main(String[] args) throws Exception {
		File file = new File(System.getProperty("user.dir") + "\\Exceldata\\newautomation.xlsx");
		        FileInputStream fis = new FileInputStream(file);
		        XSSFWorkbook workbook = new XSSFWorkbook(fis);
		        XSSFSheet sheet = workbook.getSheet("Sheet1");

		        int rowCount = sheet.getPhysicalNumberOfRows();

		        for (int i = 1; i < rowCount; i++) {
		            XSSFRow row = sheet.getRow(i);

		            if (row != null) {
		                int cellCount = row.getPhysicalNumberOfCells();

		                for (int j = 0; j < cellCount; j++) {
		                    XSSFCell cell = row.getCell(j);

		                    if (cell != null) {
		                        String cellData = getCellData(cell);
		                        System.out.print(cellData + "\t");
		                    } else {
		                        System.out.print("null\t");
		                    }
		                }
		                System.out.println();
		            }
		        }

		        workbook.close();
		        fis.close();
		    }

		    private static String getCellData(XSSFCell cell) {
		        CellType cellType = cell.getCellType();

		        switch (cellType) {
		            case STRING:
		                return cell.getStringCellValue();
		            case NUMERIC:
		                return String.valueOf(cell.getNumericCellValue());
		            case BOOLEAN:
		                return String.valueOf(cell.getBooleanCellValue());
		            case FORMULA:
		                return cell.getCellFormula();
		            case BLANK:
		                return "BLANK";
		            default:
		                return "UNKNOWN";
		        }
		    }
		


		
		
		
	}


