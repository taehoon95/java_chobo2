package java_chobo2.ch13;


class Thread04 extends Thread{

}


public class ThreadEx02 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s  ", new String("-"));
		}
		System.out.println();

		System.out.printf("%s %d 나노 초%n", "첫번째 작업", System.currentTimeMillis() - startTime);

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", "|");
		}
		System.out.println();
		System.out.printf("%s %d 나노 초%n", "두번쨰 작업", System.currentTimeMillis() - startTime);
	}

}

class ThreadEx03 {
	static long startTime = 0;
	Thread04 thread = new Thread04();

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", "|");
		}
		System.out.println();

		System.out.printf("%s %d 나노 초%n", "첫번째 작업", System.currentTimeMillis() - startTime);
	}
}