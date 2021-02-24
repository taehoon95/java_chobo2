package java_chobo2.ch15;

import java.io.File;

import javax.swing.JFileChooser;

public class FileEx2 {

	public static void main(String[] args) {
		File f = getSearchfile(); 
		File[] files = f.listFiles(); 
		
		System.out.println(f.getAbsolutePath()); 
		
		if(!f.exists() || !f.isDirectory()) { 
			System.out.println("유효 하지 않은 디렉토리입니다.");
			
			System.exit(0); 
		}
		
		for(File file : f.listFiles()) {
			System.out.println(file.isDirectory() ? "[" + file.getName() + "]" : file.getName());
		}
		
		
	}
	public static File getSearchfile() {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		
		int res = jfc.showOpenDialog(null); // 대화상자를 보여준다
		File file = null;
		if (res == JFileChooser.APPROVE_OPTION) {
			file = jfc.getSelectedFile();
			
		};
		return file;
	}
}

