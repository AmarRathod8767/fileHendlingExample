package fileHendlingExample;

import java.io.Serializable;

public class SimpleIntrest implements Serializable {
	private int p;
	private int r;
	private int t;
	private int si;
	public SimpleIntrest(int p, int r, int t) {
		
		this.p = p;
		this.r = r;
		this.t = t;
		
	}
	@Override
	public String toString() {
		return "SimpleIntrest p="+(p*r*t)/100 ;
	}
	
	

}
