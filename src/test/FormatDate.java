package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
	
	public void selectDate() throws ParseException{
	String date="30/04/1988";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	Date datetobeSelected = sdf.parse(date);
	Date currentDate = new Date();
	String monthSelected = new SimpleDateFormat("MM").format(datetobeSelected);
	System.out.println(monthSelected);
	String yearSelected = new SimpleDateFormat("yyyy").format(datetobeSelected);
	System.out.println(yearSelected);
	String day = new SimpleDateFormat("dd").format(datetobeSelected);
	System.out.println(day);
	String monAndYear =monthSelected + yearSelected;
	System.out.println(monAndYear);
	while(true){
		if(monAndYear.equals("041988")){
			System.out.println("paas");
		}
		
	}
	
	
	}

}
