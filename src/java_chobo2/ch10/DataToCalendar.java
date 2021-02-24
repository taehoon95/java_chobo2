package java_chobo2.ch10;

import java.util.Calendar;
import java.util.Date;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;
import sun.util.resources.cldr.ar.CalendarData_ar_YE;

public class DataToCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(2020, 0, 1);
		
		System.out.println(cal.get(Calendar.YEAR) + " " + (cal.get(Calendar.MONTH) + 1)+ " " + cal.get(Calendar.DAY_OF_MONTH)); // +1 을 해줘야한다 0에 1월이 자낭
		
		
			
		Date d = new Date();
		d.setYear(19);
		d.setMonth(0);
		d.setDate(1);
		System.out.printf("%tF" , d);
		
		convCalToDate(cal);
		convDateTocal(d);
				
	}
																										
	private static void convCalToDate(Calendar cal) {
		System.out.println();
		System.out.println("convert Calender To Date()");
		
		Date d = new Date(cal.getTimeInMillis());
		System.out.printf("%tF%n", d);
		
	}

	private static void convDateTocal(Date d) {
		System.out.println("convDateToCal()");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		System.out.println(cal.get(Calendar.YEAR) + " " + (cal.get(Calendar.MONTH) + 1)+ " " + cal.get(Calendar.DAY_OF_MONTH));
	}



}
