package fileHendlingExample;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;
import java.io.FileWriter;
public class FileExample {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter file content");
		s=sc.nextLine();
		File f=new File("d://amar2.txt");
		if(!f.exists())
		{
			f.createNewFile();
			System.out.println("File succesfully Created");		}
		FileWriter fw=new FileWriter(f,true);
		
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write(s);
		bw.close();
		fw.close();
		
		
		

	}

}
