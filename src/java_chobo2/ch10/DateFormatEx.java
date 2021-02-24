package java_chobo2.ch10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx {

	public static void main(String[] args) throws ParseException {
		Date today = new Date(); 
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일 E요일 a K시");// 표기 원하는대로 바꿔줄수 있다 
		System.out.println(sdf.format(today));
		
		String str = "2021년 02월 16일";
		sdf.applyPattern("yyyy년 MM월 dd일");
		
		System.out.println(sdf.parse(str)); //다시금 형태를 바꿔서 하는것
	}

}
