package java_chobo2.solostudy;

public class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	
	public Student2() {
		
	}
	
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAverage() {
		return getTotal()/3D;
	}
	
	
	@Override
	public String toString() {
		return String.format("Student name=%s, ban=%s, no=%s, kor=%s, eng=%s, math=%s 총점 = %s, 평균 = %s", name, ban, no, kor, eng,
				math, getTotal(), getAverage());
	}
	
	
}
