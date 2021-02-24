package java_chobo2.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;

import java_chobo2.Test.Student;

public class ArraysEx {// 한줄로 금방 끝내느냐 2~3일 고생하느냐

	public static void main(String[] args) {
		// arrayToString();
		// arrayDeepToString(); //2차원 배열 출력
		// arrayToEquals(); // 배열비교
		// arrayToFill(); //배열 채워넣기
		// arrayToList(); //배열을 리스트로 변경
		// arrayToBinarySearchBySort(); //정렬해서 바이너리 서치로 키찾는법
		// 우리가 따로 만든 정렬된클래스도 받아 올수 있구나!!!!!!!!!!!!
		
		Student[] stdArr = {
				new Student(1, "이종윤", 90, 90, 90),
				new Student(5, "김길현", 80, 79, 68),
				new Student(3, "박유진", 78, 91, 55),
				new Student(4, "김인환", 99, 60, 40)};
			
				//기본은 학번순으로 정렬
		
				Arrays.sort(stdArr);
				prnStudent(stdArr);
				
				System.out.println(Arrays.toString(stdArr));
				
				
				// 국어 점수 순으로 정렬
				Comparator<Student> comp = new Comparator<Student>() { // 찐정렬

					@Override
					public int compare(Student o1, Student o2) {
			
						return o1.getKor() - o2.getKor(); // 오른쪽이 작으면 양수 (기본출력)
					}
				};
				Arrays.sort(stdArr, comp);
				prnStudent(stdArr); // 이렇게 각매서드에서 호출해주면 밑에서 작업해서 반환해준다
				
				Comparator<Student> revComp = new Comparator<Student>() { // 역정렬

					@Override
					public int compare(Student o1, Student o2) {
						
						return o2.getMath()- o1.getMath(); // 오른쪽이 크면 음수이다(역정렬)
					}
					
				};
				Arrays.sort(stdArr, revComp);
				prnStudent(stdArr); // 이렇게 각매서드에서 호출해주면 밑에서 작업해서 반환해준다
				
	}

	private static void prnStudent(Student[] stdArr) { // for 문을통해 찍어서   출력해주는 방법이다
		System.out.println("정렬");
		for(Student s : stdArr) {
			System.out.println(s);
		}
		System.out.println();
	}

	private static void arrayToBinarySearchBySort() {
		int[] arr = {10,9,5,6,7,8,1};
		System.out.println(Arrays.binarySearch(arr, 8)); // 바이너리 서치는 정렬이 필수도
		System.out.println(Arrays.binarySearch(arr, 1));
		
		long start = System.nanoTime();
		
		Arrays.sort(arr); // 정렬 해주는 친구
		//Arrays.parallelSort(arr);
		long end = System.nanoTime()- start;
		System.out.println("end - " + end);
		
		System.out.println(System.nanoTime());
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 8)); // 정렬 완료 2분검색
		System.out.println(Arrays.binarySearch(arr, 1));
	}

private static void arrayToList() {
	Integer[] intArr = new Integer[] { 1, 2, 3, 4 };

	List<Integer> arList = Arrays.asList(intArr);// 오른쪽의 배열을 리스트로 변경할수 있다는것.
	for (int a : arList) {
		System.out.println(a);
	}
	arList.set(1, 6);
	System.out.println(arList);
	
		ArrayList<Integer> a1 = new ArrayList <Integer>(arList); //다시묶어서 넣어주게 되면 변경이 가능하다.
		a1.add(10); //요거는 위에꺼 처럼 딱 저 사이즈 만큼 잡아 낫으니 더는 추가가 않됀다.
		System.out.println(a1); 
}

	private static void arrayToFill() {
		int[] intArr1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(intArr1));
		int[] copyArr1 = Arrays.copyOf(intArr1, intArr1.length); // copyof(복사할 배열 , 복사할 배열 길이
		System.out.println(Arrays.toString(copyArr1));
		System.out.println(Arrays.equals(intArr1, copyArr1));

		int[] copyArr2 = Arrays.copyOf(intArr1, 3);
		System.out.println(Arrays.toString(copyArr2));

		int[] newArr = new int[10]; // 10 개의 배열에
		Arrays.fill(newArr, 10); // fill(newArr , 10을채워줘) fill -> 멀로 채워줄까
		System.out.println(Arrays.toString(newArr));

		Arrays.setAll(newArr, (i) -> (int) (Math.random() * 100) + 1); // 여기서 나오는 i 는 인덱스가 들어간다 는 말이다.
		// 결과적으로 밑에꺼와 위에 꺼와 같은데 밑에 있는 역겨운것을 위에꺼 처럼 축약한거다

		/*
		 * Arrays.setAll(newArr, new IntUnaryOperator() {
		 * 
		 * @Override public int applyAsInt(int operand) { // () - > 여기 안에 이게 드러가 잇다
		 * 
		 * return (int)(Math.random()*100) + 1; } });
		 * 
		 */
		System.out.println(Arrays.toString(newArr));
	}

	private static void arrayToEquals() {
		int[] intArr1 = { 1, 2, 3 };
		int[] intArr2 = { 1, 2, 3 }; // 같은지 비교할라면 반복문을 써야 하지 않ㄴ을까?

		System.out.println(Arrays.equals(intArr1, intArr1));

		int[][] intTwoDimen1 = { { 1, 2 }, { 3, 4 } };
		int[][] intTwoDimen2 = { { 1, 2 }, { 3, 4 } };
		System.out.println(Arrays.deepEquals(intTwoDimen1, intTwoDimen2));
	}

	private static void arrayDeepToString() {
		int[][] twoArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(twoArr)); // 겉만 햘듯이 주소만 출력해준다
		System.out.println(Arrays.deepToString(twoArr)); // 더깊숙히 안에 들어가 있는 숫자도 출력 해준다
	}

	private static void arrayToString() {
		// 현재 요것은 List 를 -> array 로 변환 해주는것이다.
		ArrayList<String> arList = new ArrayList<String>();

		arList.add("abc"); // 다 스트링 리스트 ㅁ -> ㅁ -> ㅁ-> list 기억나지? ㅋㅋ
		arList.add("def");
		arList.add("ghi");

		arList.toArray(); // object 계열로 받아버리면 이걸 타임 캐스트 해줘야한다
		Object[] objArr = arList.toArray();
		String str = Arrays.toString(objArr);
		System.out.println("objArr to String > " + str);

		String[] strArr = new String[arList.size()]; // <= 사이즈를 먼저 알아야지 빨간줄이 안뜨지
		arList.toArray(strArr); // 내가 선언한 배열로 받느냐 아니면 위에꺼 처럼 받느냐의 차이.
		System.out.println(Arrays.toString(strArr)); // 기법이다 String[] strArr 에다가 arList 에 잇는 사이즈를 담아부는것이다
	}

}
