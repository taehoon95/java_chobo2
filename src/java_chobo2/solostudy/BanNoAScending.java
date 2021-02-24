package java_chobo2.solostudy;

import java.util.Comparator;

class BanNoAScending implements Comparator {

	public int compare(Object o1, Object o2) {

		if (o1 instanceof Student2 && o2 instanceof Student2) {
			Student2 s1 = (Student2) o1;
			Student2 s2 = (Student2) o2;

			int result = s1.ban - s1.ban;

			if (result == 0) {
				return s1.no - s2.no;
			}
			return result;
		}
		return -1;

	}
}
