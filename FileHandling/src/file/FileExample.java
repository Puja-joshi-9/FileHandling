package file;

import java.io.File;

public class FileExample {
	
	public static void main(String[] args) {
		
		//Instantiate File
		File file = new File("D:\\hello.txt");
		
		//Check if above path is directory?
		boolean isDirectory = file.isDirectory();
		System.out.println("hello.txt is directory:"+ isDirectory);
		
		//File exists or not
		boolean isFileExists = file.exists();
		System.out.println("File exists:"+ isFileExists);
		
		//Create directory
		File fDir = new File("D:\\JavaTraining");
		boolean dirCreated = fDir.mkdir();     //mkdir = make directory
		if(dirCreated) {
			
			System.out.println("Java training is succesfully created.");
		}
		
		// list name of all files
		String[] fileNames = fDir.list();
		for(String fileName: fileNames) {
			
			System.out.println(fileName);
		}
		
		//List of files
		File[] files = fDir.listFiles();
		for(File file2:files) {
			System.out.println(file2.getAbsolutePath() +" "+ file2.isDirectory());
		}
		
	
	}

}
