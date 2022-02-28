package fileHendlingExample;

//port java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.*;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;

public class SimpleIntrestMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SimpleIntrest obj=new SimpleIntrest(10000,3,1);
		
		FileOutputStream fo=new FileOutputStream("d://SimpleIntrest.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(obj);
        fo.close();
        
        FileInputStream fi=new FileInputStream("d://SimpleIntrest.txt");
        ObjectInputStream os=new ObjectInputStream(fi);
        SimpleIntrest obj1=null;
        obj1=(SimpleIntrest)os.readObject();
        System.out.println(obj1);
        
        
		

	}

}
