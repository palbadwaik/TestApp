import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ToReadExcel {
	static String filePath = "G:\\2016_Selenium\\Practice\\data.xlsx";
	static String sheetName ="testdata";
	FileInputStream fs  =null;
	XSSFWorkbook workBook = null;
	XSSFSheet sheet = null;
	XSSFRow row = null;


	public ToReadExcel(String filePath) throws IOException{
		fs = new FileInputStream(filePath);
		workBook = new XSSFWorkbook(fs);
		fs.close();
	}

	public int getRowNumber(){
		int index = workBook.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else{
			sheet = workBook.getSheetAt(index);
			int rowNumber=sheet.getLastRowNum()+1;
			System.out.println(rowNumber);
			return rowNumber;
		}
	}

	public int getColCount(){
		int index = workBook.getSheetIndex(sheetName);
		if(index==-1){
			return 0;
		}
		else{
			sheet = workBook.getSheetAt(index);
			row = sheet.getRow(0);
			if(row==null){
				return -1;
			}
			else{
				int colNumber =row.getLastCellNum();
				return colNumber;
			}
		}

	}
}


