package java_chobo2.ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 역직렬화 해제 2/25
public class DserializableEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "UserInfo.ser";

		try(FileInputStream fis = new FileInputStream(fileName);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis)){
			
			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo> list = (ArrayList)ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
