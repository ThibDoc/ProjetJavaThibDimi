package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActuel {
	
	public String dateActuel(){
		
		Date actuelle = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dat = dateFormat.format(actuelle);
		return dat;
	}

}
