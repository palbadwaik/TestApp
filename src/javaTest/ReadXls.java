package javaTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXls {
	//public String path = "G:\\2016_Selenium\\Practice\\data\test.xlsx";
	public static FileInputStream fs;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
		public ReadXls() throws IOException{
			String path = "G:\\2016_Selenium\\Practice\\data\test.xlsx";
			File file = new File(path);
			fs = new FileInputStream(file);
			wb = new XSSFWorkbook(fs);
			sh = wb.getSheetAt(0);
		}
		public static int getRowCount(){
			int rowNum;
			sh = wb.getSheetAt(0);
			rowNum=sh.getLastRowNum();
			System.out.println(rowNum);
			return rowNum;
		}
		public static  int getColumnCount(){

			int colNum;
			sh = wb.getSheetAt(0);
			XSSFRow row = sh.getRow(0);
			colNum =row.getLastCellNum();
			System.out.println(colNum);
			return colNum;
		}
		public static String  getCellData(){
			sh = wb.getSheetAt(0);
			XSSFRow row = sh.getRow(0);
			String data = sh.getRow(0).getCell(0).getStringCellValue();
			System.out.println(data);
			return data;
		}
		public static void setCellData(){

			sh = wb.getSheetAt(0);
			XSSFRow row = sh.getRow(0);
			sh.getRow(0).createCell(1).setCellValue("name");
			System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		}


	}
