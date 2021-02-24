package java_chobo2.ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class FileInputStreamEx {// 2/ 24

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//fifleInputStreamEx();
		File file = new File("mysql-connector-java-5.1.49.jar");
		
		try(FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis, 1024);
				FileOutputStream fos = new FileOutputStream("mysql_lib.jar");
				BufferedOutputStream bos = new BufferedOutputStream(fos, 1024)){
			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
				
		}
			}

	private static void fifleInputStreamEx() {
		try (FileInputStream fis = new FileInputStream("KakaoTalk_20210213_202029188.jpg");
				FileOutputStream fos = new FileOutputStream("test.jpg")) {
			int data = 0;
			while ((data = fis.read()) != -1) {
				// System.out.print((char)data);
				fos.write(data);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
