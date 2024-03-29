package Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	
	public static void main(String[] args) throws IOException {
		
		User user = new User("Harry"," Harry ");
		
		File file = new File("D:\\user.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		ObjectOutputStream out = new ObjectOutputStream(fos);
		
		out.writeObject(user);
		out.flush();
		out.close();
		
		System.out.println("User object is saved in file "+file.getAbsolutePath());
	}

}
