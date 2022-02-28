package fileHendlingExample;

import java.io.*;

public class SimpleBioData {

	public static void main(String[] args) throws IOException {
	
		File f=new File("d://Amar5.txt");
		System.out.println("File Create Succesfully ");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter your Bio data");
		String s=br.readLine();
		FileWriter fr=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fr);
		bw.newLine();
		bw.write(s);
		bw.close();
		
		
		
		
		

	}

}
