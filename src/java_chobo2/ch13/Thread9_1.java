package java_chobo2.ch13;

import javax.swing.JOptionPane;

public class Thread9_1 extends Thread {
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<250000000L; x++);
		}
		System.out.println("카운트가 종료 되었습니다.");
	};
}

class Ex13_9{
	public static void main(String[] args) {
		Thread9_1 th1 = new Thread9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하소.");
		System.out.println("입력하신 값은 " + input + " 입니다.");
		th1.interrupt();
		System.out.println("isInterrupted() : " + th1.isInterrupted());
		
		
	}
}
