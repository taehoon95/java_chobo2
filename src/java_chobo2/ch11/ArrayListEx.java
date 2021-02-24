package java_chobo2.ch11;

import java.util.ArrayList;
import java.util.Comparator;


class Department{
	private int deptno;
	private String deptName;
	private int floor;



 {
		this.deptno = deptno;
	}



	public Department(int deptno, String deptName, int floor) {
		this.deptno = deptno;
		this.deptName = deptName;
		this.floor = floor;
		
	}

	


	public Department(int i) {
		// TODO Auto-generated constructor stub
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptno;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 외부의 친구와 나를 비교한다 this = 나자신, obj = 외부의 칭구
			return true;
		if (obj == null) // 널이면 비교할 필요도 없다 ㅎㅎ
			return false;
		if (getClass() != obj.getClass()) // 정보를 바로 loading getClass = 클래스 정보를 복사 한다고 보면 된다.
			return false;
		Department other = (Department) obj;
		if (deptno != other.deptno)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return String.format("Department [%s, %s, %s]", deptno, deptName, floor);
	}
	
	
}











public class ArrayListEx {

	public static void main(String[] args) {
		//  extractedMethod();
		
		ArrayList<Department> deptList = new ArrayList<Department>();
		deptList.add(new Department(1, "기획", 20));
		deptList.add(new Department(2, "개발", 10));
		deptList.add(new Department(3, "인사", 30));
	
		
		System.out.println(deptList); // indexOf, contains, remove 다 equals스가 필요하구나! 먼가 비교해서 할라면
		
		prnList(deptList);
		
		int idx = deptList.indexOf(new Department(2, "개발", 10));
		System.out.println("idx > " + idx);
		
		boolean isContain = deptList.contains(new Department(2));
		System.out.println(isContain);
		
	//	deptList.remove(new Department(2)); // 비교를 안해나서 삭제불가 그이까 equals 를 바둬라
		
	//	prnList(deptList);
		
		Department upDept = new Department(2, "마케팅", 11); // 업데이트 문 -> 바꿔주는것  
		deptList.set(deptList.indexOf(upDept), upDept);
		
		prnList(deptList);
		
		
}

	private static void prnList(ArrayList<Department> deptList) {
		for(Department d : deptList) {
			System.out.println(d);
		}
		System.out.println();
	}

	private static void extractedMethod() {
		ArrayList<Integer> arList = new ArrayList<>(); // <> 컬렉션에선 저렇게 만 댄다
		System.out.println(arList);
		
		// 추가
		
		arList.add(10); // autoboxing 10은 기본타입이네 이라서 박싱 해줘서 들어가진다
		arList.add(20);
		System.out.println(arList);
		System.out.println(arList.size());
		
		arList.add(1, 40); // 1(위에선 20이 들어간 위치)의 위치에다가 40을 집어 넣는다
		System.out.println(arList);
		System.out.println(arList.size());
		
		System.out.println("40 indexof : " + arList.indexOf(40));
		
		arList.remove(1);
		
		System.out.println(arList);
		System.out.println(arList.size());
		
		arList.add(50);
		arList.add(60);
		System.out.println(arList);
		
		arList.remove(new Integer(50)); // Integer 를 넣어줘야 오브젝트로 인식한다.
		
		for(int a : arList) { 
			System.out.println(" 확장 : " + a);
		}
		
		for(int i = 0; i < arList.size(); i++) {
			System.out.println(arList.get(i));
		}

		arList.set(1, 40);
		System.out.println(arList);
		
		if(arList.contains(30)) {
			System.out.println("30 있음");
		}else {
			System.out.println("30 없다 ");
		}
		
		System.out.println(arList.contains(60));
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		
		System.out.println(strList);
		
		strList.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) { // String class 는 이렇게 할수 밖에없다
				
				return (o1.hashCode() - o2.hashCode()) * -1; // 'a', 'b' -> 97-98 해쉬코드쉨은 이렇게 된다
															 // 결과 값이 마이너스면 역순 정렬이 된다
			}
		});
		System.out.println(strList);
		
	}

}
