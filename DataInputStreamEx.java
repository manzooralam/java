package practice;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamEx
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		DataInputStream dis= new DataInputStream(System.in);
		
		
	/*	String s;Integer obj; int f;
		s = dis.readLine();
		obj= Integer.valueOf(s);
		f= obj.intValue();
		System.out.println(f);*/
		
		//for char 
		char c= (char)dis.read();
		System.out.println(c);
		
		//s= dis.readLine();
		//int a= Integer.parseInt(dis.readLine());
		//System.out.println("Inter value= " + a);
		//char f= (char)dis.read();
		//System.out.println("Float value= "+ f);
		
		/*String s;Float obj; float f;
		s = dis.readLine();
		obj= Float.valueOf(s);
		f= obj.floatValue();
		System.out.println(f);*/
	}

}
