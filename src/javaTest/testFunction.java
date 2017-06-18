package javaTest;

import java.io.IOException;

public class testFunction {

	/*WebDriver driver = new FirefoxDriver();
	JavascriptExecutor executor = (JavascriptExecutor)driver; 
	executor.executeScript("document.getElementById("textbox_id").value='new value';); 
*/	 	
	public static void main(String args[]) throws IOException{
		//PropertiesFile.getProperty("G:\\2016_Selenium\\Practice\\test.properties");
		//ReverseString.getRevString("i am pallavi");
		FabonisSeries fs = new FabonisSeries();
		fs.getFabonissSeries(5);
		PrimeNumber prim = new PrimeNumber();
		prim.getprimeNumber(11);
		//ReadXls xls = new ReadXls();
		RevereInt rev = new Rever
		ReadXls.getRowCount();
		ReadXls.getColumnCount();
		ReadXls.getCellData();
		ReadXls.setCellData();
	}

}
