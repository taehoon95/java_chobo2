package java_chobo2.ch12;

import java.util.ArrayList;
import java.util.Iterator;

class Product{}

class Tv extends Product{}

class Audio extends Product{}

public class TestMain2 { // main

	public static void main(String[] args) {
		ArrayList<Tv> listTv = new ArrayList<Tv>();
		ArrayList<Product> listProduct = new ArrayList<>(); // 꺽쇄 제네릭스는 상속관계든 말든 다 별게로 인식한다. (오른쪽 꺽쇄에 Tv 집어 넣으면 바로 에러 니인생 끝)
		
		listTv.add(new Tv());
		
		listProduct.add(new Product());
		listProduct.add(new Tv());
		
		
		listProduct.add(new Audio());
		
		
		Iterator<Product> it = listProduct.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
