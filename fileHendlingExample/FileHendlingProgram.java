package fileHendlingExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHendlingProgram {

	public static void main(String[] args) throws IOException {

      File f=new File("d://hello.txt");
      FileWriter f1=new FileWriter(f);
      f1.write("Hello World");
      f1.close();
      
      

	}

}
