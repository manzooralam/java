package practice;

public class StringEx
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String a="hi";
		String b=a+"hello";
		String ab="hihello";
		
		System.out.println(b==ab);//how?
		System.out.println(b.equals(ab));
		
		String myString="";
		String myString2= null;
		String myString3="";
		
		System.out.println("Empty reference"+myString +" , Null Reference "+myString2 +"  , empty reference"+myString3);


	}

}
