package fileHendlingExample;

import java.io.Serializable;

public class SerilaizableTest implements Serializable{
      private int eid;
      private String sname;
      private String dpt;
      private String desing;
      private float salary;
      private int wday;
      private int abday;
      private int pday;
      private  float tsalary;
      private float pdsalary;
      
	public SerilaizableTest(int eid, String sname, String dpt, String desing, float salary, int wday, int abday) {
		
		this.eid = eid;
		this.sname = sname;
		this.dpt = dpt;
		this.desing = desing;
		this.salary = salary;
		this.wday = wday;
		this.abday = abday;
	}
	public void fun()
	{
		
		pday=wday-abday;
		pdsalary=salary/wday;
		tsalary=pday*pdsalary;
		
	}
	@Override
	public String toString() {
		return "Employee ID: " + eid + "\nName: " +sname + "\nDepartment: " + dpt + "\nDesingnation: " + desing + "\nSalary: "
				+ salary + "\nWorking Day: " + wday + "\nPayed day: " + pday + "\nTotal present day: " + pday + "\nTotal Pay Salary: " + tsalary;
	}
      

}
