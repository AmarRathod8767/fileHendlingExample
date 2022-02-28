package fileHendlingExample;

import java.io.Serializable;

public class StudentSerilizationExample implements Serializable {
    int rno;
	String name;
	
	StudentSerilizationExample(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "StudentSerilizationExample [rno=" + rno + ", name=" + name + "]";
	}
	

}
