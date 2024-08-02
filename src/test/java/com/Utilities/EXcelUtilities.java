package com.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXcelUtilities {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		return rowcount;
		
	}
	
	public  static int  getCellCount(String xlfile, String Xlsheet, int rownum) throws IOException 
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(Xlsheet);
		row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;	
	} 
	
	public static String getCellData(String xlfile,String xlsheet, int rownum, int colnm ) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnm);
		
		String data;
		try {
			//data = cell.toString();
			data = cell.toString();
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell); //Return the  formatted value of a cell as a String
			}
		
		catch(Exception e) {
			data ="";
		    }
		wb.close();
		fi.close();
		return data;
	}
		public static void setCellData1(String xlfile, String xlsheet , int rownum ,int colnum , String data )throws IOException 
		{
			fi = new FileInputStream(xlfile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(xlsheet);
			row = ws.getRow(rownum);
			cell = row.getCell(colnum);
			cell.setCellValue(data);
			fo = new FileOutputStream(xlfile);
			wb.write(fo);
			wb.close();
			fi.close();
			fo.close(); 
			
		}
		
        public static void fillRedColor()
        {
 	

        }
	
	

}
