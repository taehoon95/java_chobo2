package java_chobo2.ch13;

public class Account {
	private int balance = 1000;

	public int getBalance() {
		
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			balance -= money;
		}
	}

	
	
}

class Ex13_12 {

	public static void 
	
	
	main(String[] args) {
		Runnable r = new RunnableEx12();
		new Thread(r).start();
		new Thread(r).start();
	}

}