package java_chobo2.ch13;

public class ThreadEx01 {

	public static void main(String[] args) {
		
		Thread01 th1 = new Thread01();
		th1.start();
		// th1.run(); // -> 이걸 쓰게대면 메인에 잇는 밑에꺼 부터 하고서 run 을 수행한다
		
		Thread02 runAble = new Thread02();
		Thread th2 = new Thread(runAble); // 음?? 이렇게 해줘야한다
		
		th2.start();
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Done.");

	}

}
