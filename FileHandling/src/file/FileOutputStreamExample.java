package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	public static void main(String[] args) {
	
	try {     
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Acer\\Desktop\\stud.txt");
		String str = "Java Developers in Nepal";
		byte[] b = str.getBytes();
		fout.write(b);
		fout.close();    
		System.out.println("Information is added in the file.");
		
	}catch(FileNotFoundException e) {
		
		e.printStackTrace();
	}catch(IOException e)	{
		e.printStackTrace();
	}	
	
	}
		

}
