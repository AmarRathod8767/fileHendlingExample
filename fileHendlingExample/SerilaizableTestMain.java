package fileHendlingExample;
import java.io.*;
import java.util.Scanner;
public class SerilaizableTestMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name");
		String sname=sc.next();
		System.out.println("Enter Employee Department");
		String dpat=sc.next();
		System.out.println("Enter Employee Desingnation");
		String desing=sc.next();
		System.out.println("Enter Employee salary");
		float salary=sc.nextFloat();
		System.out.println("Enter Employee Working Day");
		int wrday=sc.nextInt();
		System.out.println("Enter Employee Absent day");
		int abday=sc.nextInt();
		SerilaizableTest obj=new SerilaizableTest(id,sname,dpat,desing,salary,wrday,abday);
		obj.fun();
		FileOutputStream fos=new FileOutputStream("d://Employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
		
	    FileInputStream fis=new FileInputStream("d://Employee.txt");
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    SerilaizableTest obj1=null;
	    obj1=(SerilaizableTest) ois.readObject();
	    ois.close();
	    System.out.println(obj1);
     		
		
	}

}
