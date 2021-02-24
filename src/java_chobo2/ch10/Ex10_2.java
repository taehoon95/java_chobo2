package java_chobo2.ch10;

import java.util.Calendar;

public class Ex10_2 {

	public static void main(String[] args) {
		//요일은 1부터 시작이기에 앞에껀 비워둠
		final String[] DAY_OF_WEEK = {"", "일", "월","화", "수", "목", "금","토"};
		
		Calendar date = Calendar.getInstance();
		Calendar date1 = Calendar.getInstance();
		
		//month 의 경우 0부터 시작하기 때문에 4월인 경우, 3로 지정해야한다.
		date.set(2019,3,29);
		System.out.println("date은" + toString(date) +  
							DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("date1은" + toString(date1) + 
							DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "이다");
		
		// 천분의 일단위로 변환 해야한다.
		long difference = (date1.getTimeInMillis() - date.getTimeInMillis())/ 1000;
		
		
		System.out.println("그날(date) 부터 지금 (date2)까지" + difference + "초가 지낫습니다.");
		
		System.out.println("일(day)로 계산하면 "+ difference/(24*60*60) + "일입니다.");
		
		
	
	}

	private static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년" + date.get(Calendar.MONTH) 
				+ "월" + date.get(Calendar.DATE) + "일"; 
	}

}
