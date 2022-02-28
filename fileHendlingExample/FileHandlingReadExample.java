package fileHendlingExample;
import java.io.*;
public class FileHandlingReadExample {

	public static void main(String[] args)  throws IOException{
		File f=new File("d://amar2.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s="";
		String s1="";
		while((s1=br.readLine())!=null)
		{
		s=s+s1;	
		}
		System.out.println(s);
		fr.close();
	
		
		
		

	}

}
