package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
//		Create date using java.util.Date:
		Date date1 = new Date();
		System.out.println(date1);
		
//		Change format to dd/MM/YYYY without hour and minutes
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = simpleDateFormat.format(date1);
		System.out.println(formattedDate);

//		Create new date using java.util.Date with the following date: 19/05/2016 23:59:30:
		Date date2 = new Date(116, 4, 19, 23, 59, 0);
//		Display date to the format year/month/day hour:minute:second
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd hh:MM:ss");
		System.out.println(simpleDateFormat2.format(date2));
		
//		Create new date containing the current date/hour of the system and display it on the same format as above:		
		String date3 = simpleDateFormat2.format(new Date());
		System.out.println(date3);
		
	}

}
