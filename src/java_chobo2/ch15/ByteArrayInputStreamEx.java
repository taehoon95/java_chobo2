package java_chobo2.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayInputStreamEx { 
	
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = bais.read()) != -1) { // () => 끝까지 읽어 드리는데 더 이상 읽을게 없다면 -1을 출력하소
			baos.write(data); //읽어서 보내준다 
		}
		
		outSrc = baos.toByteArray(); // 
		
		System.out.println("Input sorce : " + Arrays.toString(inSrc));
		System.out.println("Input sorce : " + Arrays.toString(outSrc));
		
	}
}
