package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Acer\\Desktop\\bstud.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//int i;
		
		String row;
		while((row = br.readLine()) != null) {
			
			System.out.println(row);
		}
		
		br.close();
		fr.close();
	}

}
