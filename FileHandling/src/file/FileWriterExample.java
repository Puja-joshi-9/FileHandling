package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Acer\\Desktop\\bstud.txt");
			fw.write("Java Developers of Nepal.\nRunning Chapter: File Handling, FileWriter.");
			
			fw.close();
			
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		System.out.println("Information is added in the file");
		
	}

}
