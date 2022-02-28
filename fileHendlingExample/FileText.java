package fileHendlingExample;

import java.io.Serializable;

public class FileText implements Serializable {
	private String name;
	//transient String fname;
	private String fname;
	private String add;
	
	FileText(String name, String fname, String add)
	{
		this.name=name;
		this.fname=fname;
		this.add=add;
		
	}

	@Override
	public String toString() {
		return "My name is " + name + "My Father name is " + fname + "My Address is " + add;
	}
	
	

}
