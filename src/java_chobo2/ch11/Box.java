package java_chobo2.ch11;

import java.util.ArrayList;

public class Box<T> { // 꺽쇄 의 활용 2/22
	private ArrayList<T> list; // 오른쪽엔 생략 가능 -> 명시적 초기화
	
	
	
	public Box() {
		list = new ArrayList<>(); // 이렇게도 가능하다 (선호도에 따라 달라진다.)
	}

	public void add(T item) {
		list.add(item);
		
	}

	public T get(int idx) { // 퍼블릭 t 반환타입스
		
		return list.get(idx);
	}

	public ArrayList<T> getList() {
		return list;
	}

	public int size() {
		return list.size();
	}


	
	
	
}
