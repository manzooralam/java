package practice;

public class GenericMethod
{ 
	public <e>void printArray(e []s) {
		
		 for (int i= 0; i<s.length; i++)
			 System.out.println(s[i]);
	}
	
	/*public void printArray(Integer []n) {
		
		 for (int i= 0; i<n.length; i++)
			 System.out.println(n[i]);
	}*/

	public static void main(String[] args)
	{
		
           GenericMethod g= new GenericMethod();
           String []str= {"md", "Manzoor","Alam"};
           Integer []it= {12, 13, 14};
           g.printArray(str);
           g.printArray(it);
	}

}
