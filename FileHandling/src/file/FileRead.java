package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		

		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Acer\\Desktop\\stud.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			int i;
			while((i = bin.read()) != -1) {
				System.out.println((char) i);
			}
			
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		 
	}

}
