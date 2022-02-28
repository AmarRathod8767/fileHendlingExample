package fileHendlingExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHendlingReadExample1 {

	public static void main(String[] args) throws IOException{
		File f=new File("d://amar1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s="";
		String s1="";
		while((s=br.readLine())!=null)
		{
			s1=s1+s;
		}
		System.out.println(s1);
		fr.close();
		br.close();
		
		

	}

}
