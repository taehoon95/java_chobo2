package java_chobo2.solostudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Student implements Comparable{
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
	
		
		public Student() {
			
		}
		
		

		public Student(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public Student(String name, int ban, int no, int kor, int eng, int math) {
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
		

		
	
		




		public static void main(String[] args) {
			ArrayList list = new ArrayList();
			
			
			list.add(new Student("홍길동", 1, 1, 100, 100, 100));
			list.add(new Student("남궁성", 1, 2, 90, 70, 80));
			list.add(new Student("김자바", 1, 3, 80, 80, 70));
			list.add(new Student("이자바", 1, 4, 70, 90, 70));
			list.add(new Student("안자바", 1, 5, 60, 100, 80));
			
			
			
			
			
			Collections.sort(list);
			Iterator it = list.iterator();
			

			while(it.hasNext()) {
				System.out.println(it.next());
			}
				

		}



		@Override
		public int compareTo(Object o) {
			if(o instanceof Student) {
				Student tmp = (Student)o;
				
				return name.compareTo(tmp.name); // 비교값을 컴페어투로 형벼
			}
			return -1;
		}



		

	

		
}
