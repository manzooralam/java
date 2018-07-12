package practice;

import java.util.Scanner;


class Account{
	private int amount;
	Account(int amount){
		this.amount= amount;
	}
	
	public boolean isSufficientBalance(int withdrow){
		if(amount > withdrow)
		return true;
		else
		return false;
	}
	public void withdrowBalance(int withdrow){
		amount = amount - withdrow;
		System.out.println("Withdrawl money is " + withdrow);
		System.out.println("Your Current balance is " + amount);
	}
}
class Customers implements Runnable{

	Account account= new Account(1000);
	private String name;
	public Customers(Account account , String name){
		
		this.account = account;
		this.name = name;
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println(name +"amount is withdrawl");
		int amt= sc.nextInt();
		
		if(account.isSufficientBalance(amt)){
			System.out.println(name);
			System.out.println(amt);
		}
		else
		System.out.println("Insufficient Balance : ");
	}
 }	
	

public class SynchronizeExp
{

	public static void main(String[] args)
	{
		Account a= new Account(1000);
		Customers c1= new Customers(a, "Raj");
		Customers c2= new Customers(a, "Simron");
		

	}

}
