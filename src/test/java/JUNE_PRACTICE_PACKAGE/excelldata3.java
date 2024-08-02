package JUNE_PRACTICE_PACKAGE;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class excelldata3 {
    public static void main(String[] args) {
        String excelFilePath =(System.getProperty("user.dir")+"\\Exceldata\\newautomation.xlsx");
        int startRow = 1; // Starting row index (0-based)
        int endRow = 10; // Ending row index (0-based)
        int userIdColumn = 0; // Column index for user ID (0-based)
        int passwordColumn = 1; // Column index for password (0-based)

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            for (int rowIndex = 1; rowIndex <= endRow; rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row != null) {
                    Cell userIdCell = row.getCell(userIdColumn);
                    Cell passwordCell = row.getCell(passwordColumn);

                    if (userIdCell != null && passwordCell != null) {
                        String userId = getCellValueAsString(userIdCell);
                        String password = getCellValueAsString(passwordCell);

                        System.out.println("User ID: " + userId);
                        System.out.println("Password: " + password);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getCellValueAsString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}
