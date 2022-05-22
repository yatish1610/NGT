package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class stringtodate {
	public static void main(String[] args) {
		String str = "16/10/1999";
		try {
			//Convert using SimpleDateFormat Class and Pattern, use parse to convert the String.
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str);
			System.out.println(" "+date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}
}