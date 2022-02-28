package fileHendlingExample;

import java.io.*;

public class SerilizationMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		StudentSerilizationExample obj=new StudentSerilizationExample(123,"xyz");
		File f=new File("d://SeriLi");
		
		FileOutputStream fs=new FileOutputStream(f);
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(obj);//object to stream
		fs.close();

		FileInputStream fis=new FileInputStream(f); 	
		ObjectInputStream ois=new ObjectInputStream(fis);
		StudentSerilizationExample obj11=(null);
		obj11=(StudentSerilizationExample)ois.readObject();
		System.out.println(obj11);
		
		
		
		

	}

}
