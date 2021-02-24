package java_chobo2.ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class NumberToStringEx {

	public static void main(String[] args) throws ParseException {
//			ExtractedMethod();
		// 만약 pattern : #,###
		// 1234567 -> format(pattern)  -> "123,567" 숫자를 문자로 
		//	"123,567" -> parse(pattern)  -> 123,567 문자를 숫자로
		
		
		
		
		
		// 숫자를  - > 문자로 표시 format
		int salary = 12345678;
		DecimalFormat df = new DecimalFormat("#,###.#"); // 12345678 숫자를 이렇게 변환해돌라
		System.out.println(df.format(salary));
		System.out.printf("%,d%n :", salary);
		String str = String.format("%,d%n", salary);
		System.out.println(str);
		String strDb1 = String.format("%,.2f", 1234.56);
		System.out.println("나온다" + strDb1);
		
		// 문자를 -> 숫자로 표시 parse
		String strNum = "123,456";
		DecimalFormat df2 = new DecimalFormat("0,000");
		int i = df2.parse(strNum).intValue();  // <- 요걸로도 된다.
		System.out.println(df2.parse(strNum));
		
	//Number s = df2.parse(strNum); <- 이것도 되고
	//	int i = s.intValue();
		System.out.println("야스: " + i);
		
		
	}

	private static void ExtractedMethod() throws ParseException {
		double number = 1234567.89;
		System.out.println("number > " + number);
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,###.#"); // 3자리마다 , 넣어돌라
		
		String str = df.format(number);
		
		System.out.println(str); // 요렇게 나오는건 문자
		
		df.applyPattern("000000000.0"); // 앞대가리를 0으로 표시해돌라
		System.out.println(df.format(number));
		
		df.applyPattern("##########.#");
		System.out.println(df.format(number)); // 숫자를 넣어줄때 사용한다
		
		df.applyPattern("#.#E0"); // 1.2 * 10^6 (10에 6승)
		System.out.println(df.format(number));// E7 오른쪽에서 부터 10개 이동
		
		Number numberStr = df.parse("1.2E6");
		Double d = numberStr.doubleValue();
		System.out.println(d);
		
		
		df.applyPattern("#,###.0");
		numberStr = df.parse("123,456.55"); // 쉼표 한새@끼 덕에 문자로 나오는거다 저건
		d = numberStr.doubleValue();
		System.out.println(d);
	}

}
