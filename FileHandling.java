package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling
{

	public static void main(String[] args)
	{
		try
		{
			FileWriter fw= new FileWriter("./file5.txt", true);
			BufferedWriter br= new BufferedWriter(fw);
			
			br.write("Computer");
			//System.out.println("Size of file " +((CharSequence) br).length());
			br.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}
