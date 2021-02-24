package java_chobo2.ch11;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import java_chobo2.Test.Student;

public class HashMapEx {

	public static void main(String[] args) {
		// 학번을 통해서 저, "유한솔", 90, 80, 70); // std 정의 
		
		HashMap<Integer, Student> map = new HashMap<>(); // 해쉬맵 객체 생성
		Student std1 = new Student(1, "이태훈", 90, 80, 70);
		Student std2 = new Student(2, "애자리얼", 90 , 30,20);
		Student std3 = new Student(3, "김재룡", 90, 80, 70);
		Student std4 = new Student(4, "신범건", 90, 80, 70);
		Student std5 = new Student(5, "김경연", 90, 80, 70);

		map.put(std1.getStdNo(), std1); // std안에다가 집어넣는것 왼쪽것이 키값 오른쪽이 밸류 값을 받아오는것
		map.put(std2.getStdNo(), std2);
		map.put(std3.getStdNo(), std3);
		map.put(std4.getStdNo(), std4);
		map.put(std5.getStdNo(), std5);

		prnMap(map);

		Student std6 = new Student(3, "김재령", 90, 88, 77); // 요게 자 수정하는 방법이다
		map.replace(std6.getStdNo(), std6); // 리플을 써서 키와 값을 받아오는거다

		prnMap(map);

		boolean isExists = map.containsKey(3);
		System.out.println(isExists);
		
		map.remove(3);
		prnMap(map); //아... prnMap 메서드가 이렇게 편리하게 쓰이는구나 잘 기억해두자

	}

	private static void prnMap(HashMap<Integer, Student> map) { // 요기서 작업을 다쳐준다. 보고 느껴라
		System.out.println("==== SET ====");
		Set<Entry<Integer, Student>> s = map.entrySet(); // 키와 밸류가 entry 셋으로 묶여져 잇다
		// 비교하는것 
		for (Entry<Integer, Student> e : s) { // s는 엔트리 셋의 묶음이니 그냥 한개씩 받는거다
			System.out.println(e.getKey() + ">" + e.getValue());
		}
		System.out.println();

		/*
		 * System.out.println("==== KEY ===="); Set<Integer> keySet =map.keySet(); //
		 * key만 가져와 달라는 뜻이다 for(Integer key : keySet) { System.out.println(key + " > " +
		 * map.get(key)); } System.out.println();
		 */

	}

}
