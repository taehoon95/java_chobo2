package java_chobo2.ch11;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {
		return (name + age).hashCode(); // 괄호안에 것은 문자 열이댄다  name+age 의값을 hashcode 로 변환한다
	}


	@Override
	public boolean equals(Object obj) { // 내가 가지고있는 이름 과 object 가 가지고 잇는 이름을 비교하는 것
		if(obj instanceof Person) {
			Person object = (Person)obj; //(형변환) 해줘야지 비교가능하지
			if(this.name.equals(object.name) && this.age == object.age) {
				// name 은 문자열이니 equals 로 비교 age 는 숫자이니 저렇게 == 대입연산자로 비교
				return true;
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}
	
	
	
}

public class HashSetEx2 {

	public static void main(String[] args) {
		//hashCodeAndEquals(); 이거는 해쉬코드의 값들을 비교해서 같은지 아닌지를 판별하는것
		
		Person p1  = new Person("전수린", 40);
		Person p2  = new Person("전수린", 40);
		Person p3  = new Person("우정아", 40);
		Person p4  = new Person("정민강", 30);
		
		HashSet<Person> ban = new HashSet<Person>();
		ban.add(p1);
		System.out.println("size " + ban.size()); // p1 과 p2 를 비교해서 동일한 사람이면 비교를 안한다
		ban.add(p2);
		System.out.println("size " + ban.size()); // 근데 위에 오버라이딩 됀 이꿜스를 안하면 서로 다른 객체로 인식한다.
		ban.add(p3);
		System.out.println("size " + ban.size());
		ban.add(p4);
		System.out.println("size " + ban.size());
		
		
	}

	private static void hashCodeAndEquals() {
		Person p1  = new Person("전수린", 40);
		
		
		int hashCode1 = p1.hashCode();
		int hashCode2 = p1.hashCode();
		
		System.out.printf("%d = %d%n", hashCode1, hashCode2);
	//	p1.age = 30;
		
		int hashCode3 = p1.hashCode();
		System.out.println("hashCode3 - " + hashCode3);
		
		Person p2  = new Person("전수린", 40); // 내용으로 해도 같아야하니까. 
		
		int hashCode4 = p2.hashCode();
		System.out.println("hashCode4 " + p2.hashCode()); // 우리가 비교할려면 같아야한다.
		
		boolean isEquals = p1.equals(p2);
				System.out.println("p1 = p2 : " + isEquals);
	}

}
