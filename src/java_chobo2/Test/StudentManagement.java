package java_chobo2.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;



public class StudentManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Student> students = new HashMap<>();
		initial(students);
		prnStudent(students);
		
		

		System.out.println("학생관리 프로그램");
		int choice;
		do {
			showMenu();
			System.out.print("메뉴 > ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addStudent(students, sc);
				break;
			case 2:
				modifyStudent(students, sc);
				break;
			case 3:
				deleteStudent(students, sc);
				break;
			case 4:
				prnStudent(students);
				break;
			}
		} while (choice < 5);
		sc.close();
	}
	
	private static void deleteStudent(HashMap<Integer, Student> students , Scanner sc) {
		//prnStudent(students);
		System.out.print("삭제하고자하는 학생번호 입력 > ");
		int delStdNo = sc.nextInt();
		
		if (!students.containsKey(delStdNo)) {
			System.out.println("해당 하는 학생이 존재하지 않음");
			
			return;
		}
		
		students.remove(delStdNo);

		
	}

	private static void modifyStudent(HashMap<Integer, Student> students, Scanner sc) {
		// 1. 학생번호 입력
		// 2. 해당 위치에 입력받은 학생정보를 변경
		prnStudent(students);
		System.out.print("수정하고자하는 학생번호 입력 > ");
		int findStdNo = sc.nextInt(); // 입력 받은 값을 findStdNo 에다가 저장
		Student upStd =  createStudent(sc); // createStudent 에 있는것을 upStd 에다가 저장한다.
		
		
		if (!students.containsKey(findStdNo)) { // 비교
			System.out.println("해당 하는 학생이 존재하지 않음");
			return;
		}
		students.remove(findStdNo);
		
		students.put(upStd.getStdNo(), upStd);
	}

	
	private static void addStudent(HashMap<Integer, Student> students, Scanner sc) {
		//1. 저장된 학생수 입력 or 종료 
		//2. 추가할 위치를 검색
		//3. 추가할 학생정보를 입력
		Student newStd = createStudent(sc);
		
		if (students.containsKey(newStd)) { // 키의 중첩검사엔 containsKey 오버라이딩 됀 이꿜스가 알아서 해준다 
			System.out.println("해당 하는 학생이 존재"); // 차피 같은 키값만 검사하면 대지 않겟는가?
			return;
		}
		
		newStd = students.put(newStd.getStdNo(),  newStd); //입력 받은것을 newStd 에 저장한다
		
	
		
		}
		
	

	private static Student createStudent(Scanner sc) {
		System.out.println("학생 정보를 입력하세요. ex) 번호 성명 국어 영어 수학 ");
		int stdNo = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		return new Student(stdNo, name, kor, eng, math);
	}

	

	private static void prnStudent(HashMap<Integer, Student> students) {
		
		Iterator<Entry<Integer,Student>> i = students.entrySet().iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next()); //  i 값에다가  students 와 entryset 의값을 가져와 집어넣는다
		}
		System.out.println();
	}

	private static void initial(HashMap<Integer, Student> students) {
		
		students.put(1, new Student(1, "전수린", 90, 90, 90)); //키 값과 밸류값은 put 으로 넣는다
		students.put(2, new Student(2, "김상건", 91, 91, 91));
		students.put(3, new Student(3, "이태훈", 92, 92, 92));
		
	
	}

	private static void showMenu() {
		String[] m = new String[6];
		m[0] = "메뉴를 선택하새요.\n";
		m[1] = "1. 학생 추가\n";
		m[2] = "2. 학생 수정\n";
		m[3] = "3. 학생 삭제\n";
		m[4] = "4. 학생 목록\n";
		m[5] = "5. 종료\n";

		for (String str : m) {
			System.out.print(str);
		}
	}
}
