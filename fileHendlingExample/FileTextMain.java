package fileHendlingExample;
import java.io.*;
import java.util.Scanner;
public class FileTextMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		String nm=sc.nextLine();
		System.out.println("Enter Father name ");
		String fn=sc.nextLine();
		System.out.println("Enter Address name ");
		String ad=sc.nextLine();
		
		FileText obj=new FileText(nm+"\n",fn+"\n",ad);
		FileOutputStream fs=new FileOutputStream("d://fileTxt.txt");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(obj);
		fs.close();
		
		FileInputStream fis=new FileInputStream("d://fileTxt.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		FileText obj1=null;
		obj1=(FileText) ois.readObject();
		System.out.println(obj1);
		ois.close();
		
		
		
		
		

	}

}
