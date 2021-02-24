package java_chobo2.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



public class ListEx { // 자료구조를 HashMap 으로도 할줄 알아야지

	public static void main(String[] args) { // 물음표가 대면 다담을수가 있다
		//extracted();
		
		HashMap<Integer, Department> deptHash = new HashMap<>();
		
		deptHash.put(1, new Department(1, "기획", 20));
		deptHash.put(2, new Department(2, "개발", 21));
		deptHash.put(3, new Department(3, "인사", 22));
		deptHash.put(4, new Department(4, "총무", 23));
		
		System.out.println(deptHash);
		
		Iterator<Entry<Integer, Department>> i = deptHash.entrySet().iterator(); // iterator 을 한번 써봐야 한다.
		while (i.hasNext()) {
			Entry<Integer, Department> e = i.next();
			
			//System.out.println(e.getKey() + " ");
			//System.out.println(e.getValue());//  그림 보면서 이해하라
			System.out.println(deptHash.get(e.getKey()));
		}
		
	}

	private static void extracted() {
		ArrayList objList = new ArrayList<>();
		objList.add("aa");
		objList.add(1);
		objList.add(new Department(1, "최순실", 10));
		
		
		Iterator i = objList.iterator(); // iterator 을 통해서도 할수 있다
		
		while (i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}
		
		ArrayList<Department> deptList = new ArrayList<>();
		deptList.add(new Department(1, "기획1", 10));
		deptList.add(new Department(2, "기획2", 20));
		deptList.add(new Department(3, "기획3", 30));
		
		Iterator<Department> iDept = deptList.iterator(); // for 문을 이용 못하는 경우가 있을텐데 그때 Iterator 를 써주면 된다.
		while(iDept.hasNext()) {
			System.out.println(iDept.next());
		}
	}

}
