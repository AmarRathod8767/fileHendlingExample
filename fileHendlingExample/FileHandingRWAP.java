package fileHendlingExample;
import java.io.*;
public class FileHandingRWAP {
     File f;
	public void creatFile() throws IOException
	{
		f=new File("d://amar4");
		if(!f.exists())
		{
			f.createNewFile();
			
		}
		System.out.println("File succesfully Created");
	}
	public void writeFile() throws IOException
	{
		FileWriter fr=new FileWriter(f,true);
		BufferedWriter br=new BufferedWriter(fr);
		
		System.out.println("Enter data ");
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader brs=new BufferedReader(sr);
		String s=brs.readLine();
		br.write(s);
		br.close();
		fr.close();
		System.out.println("File write Succesfully");
		
	}
	public void readFile() throws IOException
	{
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s1="";
		String s2="";
		while((s1=br.readLine())!=null)
		{
			s2=s2+s1;
			
		}
		System.out.println(s2);
		br.close();
		fr.close();
		System.out.println("File write Succesfully");
	}
	
	void appendFile() throws IOException
	   {
	        FileWriter fw = new FileWriter(f);
	        BufferedWriter bw = new BufferedWriter(fw);
	        System.out.println("Enter data");
	      InputStreamReader ir = new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(ir);
	      String s = br.readLine(); 
	      bw.write(s);
	      bw.close();
	      fw.close();
	   }
	 
	public static void main(String[]args) throws IOException
	{
		FileHandingRWAP obj=new FileHandingRWAP();
		obj.creatFile();
		obj.writeFile();
		obj.appendFile();
		obj.readFile();
		
	}
}
