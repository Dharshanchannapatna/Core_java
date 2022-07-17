package xworkz.Exceptionhandling.ce4;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
int balance=20000;
System.out.println("Enter amount:");
int s=scan.nextInt();
if (s<=balance) {
	System.out.println("Withdraw Successful");
}
else
{
	try{
		
	throw new InsufficientBalanceException();
	}
	catch (InsufficientBalanceException e) {
		System.out.println("Not Enough Balance to With Draw");
		
	}
}
	}

}
