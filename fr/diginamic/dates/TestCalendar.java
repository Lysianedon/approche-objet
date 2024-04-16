package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 
		System.out.println(sdf.format(cal.getTime()));
		
//		Use Calendar to create new date set to today's date:
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(new Date());
		
//		Display the instance in yyyy/MM/dd hh:mm:ss format:
		Date today = cal2.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf2.format(today));
		
//		Creating locales in foreign languages:
		Locale frenchLocale = Locale.FRANCE;
		Locale chineseLocale = Locale.CHINA;
		Locale russianLocale = new Locale("ru", "RU");
		Locale deutschLocale = new Locale("de", "DE");
		
		SimpleDateFormat sdfFrench = new SimpleDateFormat("EEEE yyyy MMMM dd hh:mm:ss", frenchLocale);
		SimpleDateFormat sdfChinese = new SimpleDateFormat("EEEE yyyy MMMM dd hh:mm:ss", chineseLocale);
		SimpleDateFormat sdfRussian = new SimpleDateFormat("EEEE yyyy MMMM dd hh:mm:ss", russianLocale);
		SimpleDateFormat sdfDeutsch = new SimpleDateFormat("EEEE yyyy MMMM dd hh:mm:ss", deutschLocale);
		
//		Display the final results:		
		System.out.println(sdfFrench.format(today));
		System.out.println(sdfChinese.format(today));
		System.out.println(sdfRussian.format(today));
		System.out.println(sdfDeutsch.format(today));
		
		
		
		
	}

}
