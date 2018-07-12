package practice;

import java.util.Scanner;

public class Exception
{
	public static void main(String[] args)
	{
		/*// default throw and default catch----- end program
		     if any errors occurs, then java choose any of them of prelisted situation, create object of 
		     appropriate class then do throw,and run java default catch mechanism, 
		     gives errors msg , and end the program 
		 
		*/
		
		/*
		 //default throw and our catch---- no end program
		   
		 */
		/*int a,b;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		try {
			System.out.println("First Line try block");
			System.out.println(a/b);
			System.out.println("Last line try block");
		}catch(ArithmeticException e) {
			 System.out.println("Exception : " + e.getMessage());
		}
		finally {
			System.out.println("Last line of the program");
		}*/
		
	/*	// our throw default catch 
		int balance = 500, withdaw= 2000;
			 if(!(balance > withdaw))
				 throw new ArithmeticException("Insufficient Balance");
		balance = balance - withdaw;
		System.out.println("Transaction completed...");
		System.out.println("Program continu.....");
		*/
		
		
	/*  // our throw and our catch 
		      try {
				   int balance = 500, withdaw= 200;
					if(!(balance > withdaw))
					 throw new ArithmeticException("Insufficient Balance");
				   balance = balance - withdaw;
				   System.out.println("Transaction completed...");
		         }catch (ArithmeticException e) {
					System.out.println("Our Exception msg :" + e.getMessage());
				}
				System.out.println("Program continu.....");
				*/
		}

	}


