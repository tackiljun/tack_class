package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableTest2 {

	public static void main(String[] args) {
		
		ObjectInputStream inputStream = null;
		
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			inputStream = new ObjectInputStream(in);
			
			Person p = (Person) inputStream.readObject();
			String newStr = (String) inputStream.readObject();
			//Person p = (Person) inputStream.readObject();
			
			p.tell();
			System.out.println(newStr);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
