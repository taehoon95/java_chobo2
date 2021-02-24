package java_chobo2.ch15;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class FileEx {

	public static void main(String[] args) throws IOException {

		// File f = new
		// File("C:\\workspace_java\\native_jdbc_programing\\src\\native_jdbc_programing\\dto\\Department.java");
		File f = getSearchfile();

		String fileName = f.getName();
		System.out.println(fileName);

		int idx = fileName.lastIndexOf(".");

		System.out.println("경로를 제외한 파일 이름 - " + f.getName());
		System.out.println("확장자를 제외한 파일 이름 - " + fileName.substring(0, idx));
		System.out.println("확장자  - " + fileName.substring(idx + 1));

		System.out.println("경로를 포함한 파일이름  - " + f.getPath());
		System.out.println(" 파일의 절대경로  - " + f.getAbsolutePath());
		System.out.println(" 파일의 정규경로 - " + f.getCanonicalPath());
		System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
		System.out.println("---------------------");
		System.out.println("File.pathSeparator - " + File.pathSeparator);
		System.out.println("File.separatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separtor - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println("---------------------");
		System.out.println("user.dir = " + System.getProperty("user.dir"));
		System.out.println("sun.bood.class.path = " + System.getProperty("sun.boot.class.path"));

	}

	private static File getSearchfile() {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		
		int res = jfc.showOpenDialog(null); // 대화상자를 보여준다
		File file = null;
		if (res == JFileChooser.APPROVE_OPTION) {
			file = jfc.getSelectedFile();
			System.out.println(file.getAbsolutePath());
		}
		
		return file;
	}

}
