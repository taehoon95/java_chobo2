package java_chobo2.ch12;

public class Fruit implements Eatable {

	@Override
	public String toString() {
		return "Fruit ";
	}

}

interface Eatable {
}

class Apple extends Fruit {

	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy{
	@Override
	public String toString() {
		return "Toy";
	}
}

class FruitBox<T extends Fruit&Eatable> extends Box<T>{}

class Ex12_3{
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println("fruit box - " + fruitBox);
		System.out.println("fruit box - " + appleBox);
		System.out.println("fruit box - " + grapeBox);
		
	}
}