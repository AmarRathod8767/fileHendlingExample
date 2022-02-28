package fileHendlingExample;

public class CalLargestChar {

	public static void main(String[] args) {
		String s="ABAC ABC EFG ";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			
			int m=0;
			int  a=s.charAt(i);
			if(a!=32)
			{
				s1=s1+s.charAt(i);
			}
			else 
			{
				System.out.println(s1);
				
			
			
			for(int j=0;j<s1.length();j++)
			{
			   if(m<s1.charAt(j))
			   {
				   m=s1.charAt(j);
			   }
			   
			}
			  System.out.println(m);
			  System.out.println((char)m);
	      s1="";
	      
		}}

	}

}
