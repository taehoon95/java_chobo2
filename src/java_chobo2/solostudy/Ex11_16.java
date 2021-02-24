package java_chobo2.solostudy;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	private static Object password;

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("abc", "1111");
		map.put("def", "1543");
		map.put("myId", "1999");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.println("id : ");
			String id =  s.nextLine().trim();
			
			
			
			System.out.println("password : ");
			String password = s.nextLine().trim();

			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 안습니다");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비번 불일치");
				
			}else {
				System.out.println("id 와 비밀번호가 일치합니다.");
				break;
			}
		}
		
		

	}

}
