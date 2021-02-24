package java_chobo2.solostudy;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import java_chobo2.Test.Student;

public class HashMapYeah {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> map = new HashMap<>();
		
		
		Student std1 = new Student(1, "나다", 90, 70, 60);
		Student std2 = new Student(2, "이십", 80, 90, 60);
		Student std3 = new Student(3, "새끼야", 90, 52, 67);
		Student std4 = new Student(4, "형은", 50, 70, 80);
		Student std5 = new Student(5, "나가", 90, 81, 69);
		Student std6 = new Student(6, "있어", 100, 70, 70);
		
		map.put(std1.getStdNo() , std1  ); // student 에 잇는것중 번호로 비교할것들
		map.put(std2.getStdNo() , std2  );
		map.put(std3.getStdNo() , std3  );
		map.put(std4.getStdNo() , std4  );
		map.put(std5.getStdNo() , std5  );
		map.put(std6.getStdNo() , std6  );
		
		prnMap(map);
		
		Student std7 = new Student(3, "머래븅신이", 10, 20, 11);
		map.replace(std7.getStdNo(), std7);
		
		prnMap(map);
		
		boolean isExists = map.containsKey(3); // 맞는지 확인해주는 키이다. akwdmaus 3번 훟하후하후하ㅜㅏㅎ
		System.out.println(isExists);
		
		map.remove(3);
		prnMap(map);
		
		
	}
	

	private static void prnMap(HashMap<Integer, Student> map) {
		System.out.println("=========");
		// Set 중복허용을 하지않고 저장순서가 유지되지 않는.
		// Entry 는 map 의 키값 (Integer,Student)값을 묶어주는 것이다리
		Set<Entry<Integer,Student>> s = map.entrySet();
		
		for(Entry<Integer,Student> e :  s) {
			System.out.println(e.getKey()+ "= " + e.getValue());
		}
		System.out.println();
		
	}

}
