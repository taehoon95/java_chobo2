package java_chobo2.ch12;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		Box<String> box = new Box<>(); // Box 에 잇는게 다 스트링으로 바뀐다
		box.add("abc");
		box.add("def");
		
		System.out.println(box.get(0));
		String item = box.get(0);
		System.out.println("item : " + item);
		
		ArrayList<String> list = box.getList();
		list.stream().forEach(System.out::println); // 하나 꺼내와서 찍어주고 하나 꺼내와서 찍어준다는 말
		
		System.out.println(box);
	}

}
