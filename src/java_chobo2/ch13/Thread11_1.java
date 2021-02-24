package java_chobo2.ch13;

class Ex13_11 {
	static long startTime = 0;

	public static void main(String[] args) {
		Thread11_1 th1 = new Thread11_1();
		Thread11_2 th2 = new Thread11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {}

		System.out.println("소요시간 : " + (System.currentTimeMillis() - Ex13_11.startTime) );
	}
}
// ----------------------------
	class Thread11_1 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 300; i++) {
				System.out.println(new String("-"));
			}

		}
	}

//----------------------------
class Thread11_2 extends Thread{
	@Override
	public void run() {
		for(int i =0; i<300; i++) {
			System.out.println(new String("|"));
		}
	
	}
}

