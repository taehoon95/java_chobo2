package java_chobo2.ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWirterEx {

	public static void main(String[] args) throws FileNotFoundException, IOException { // 우리가 그전에 썻던거 보다 빠르다
		// fileReaderWriteEx();
		try (FileReader fr = new FileReader("output2.properties"); // 파일 리더로 하면 버퍼리더로 맞춰 주야한다 꼭!!
				BufferedReader br = new BufferedReader(fr, 8192);

				FileWriter fw = new FileWriter("test.properties");
				BufferedWriter bw = new BufferedWriter(fw, 8192)) {
			String line;
			while(( line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		}

	}

	private static void fileReaderWriteEx() {
		try (FileReader fr = new FileReader("oupt.xml"); FileWriter fw = new FileWriter("test.xml")) {
			char[] cbuf = new char[512]; // 512 개를 읽기 떄문이다.
			while ((fr.read(cbuf)) != -1) {
				fw.write(cbuf);
			}
		} catch (FileNotFoundException e) {
			System.err.println("해당 아이디 없다.사라져라.");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
