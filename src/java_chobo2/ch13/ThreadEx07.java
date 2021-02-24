package java_chobo2.ch13;

public class ThreadEx07 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Thread03());
		t1.setDaemon(true); // <- 데몬 쓰레드를 만약 안쓴다면 꼐쏙 무한반복으로 돈다 
							// 근데 이것을 하게 된다면 main 수행시킨 곳에서 종료가 되면 왼쪽 무한 반복문도 같이 종료 시켜준다
		t1.start();
		
		for(int i = 1; i< 11; i++) {
			Thread.sleep(1000);
			System.out.println(i);
			
			if(i==5) Thread03.autoSave = true;
		}
		
		System.out.println("프로그램 종료");

	}

}
