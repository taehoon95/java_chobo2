package java_chobo2.ch13;

public class ThreadEx06 {

	public static void main(String[] args) {
		
		Thread01 th1 = new Thread01();
		th1.setPriority(2); // 우선순위 설정방법
		th1.start();
		System.out.println("우선순위 th1 " + th1.getPriority());
		
		
		
		Thread02 runAble = new Thread02();
		Thread th2 = new Thread(runAble); // 음?? 이렇게 해줘야한다
		th2.setPriority(8);
		System.out.println("우선순위 th2 " + th2.getPriority());
		th2.start();
		
	}

}
