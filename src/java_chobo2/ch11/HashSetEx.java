package java_chobo2.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetEx {

	public static void main(String[] args) { // 랜덤 클래스

		HashSet<Integer> set = new HashSet<Integer>(); // 이새끼는 중복을 안받는다

		Random rnd = new Random(1234); // 시드값을 넣으면 고정됀채로 나온다
		ArrayList<Integer> list = new ArrayList<>(); // 이건 중복이 돼는디

		for (int i = 0; i < 10; i++) {
			int r = rnd.nextInt(5); // 똑같은 값을 집어 넣어야 하니까 이렇게 만든다
			list.add(r);
			set.add(r);
		}
 
		System.out.println(list);
		System.out.println(set);

	}

}
