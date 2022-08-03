package xworkz.Exceptionhandling.costumexception3;

import java.util.Scanner;

public class LoginForm {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter user id:");
	      String id=scan.next();
	      System.out.println("Enter password:");
	       int password=scan.nextInt();
	
	if(id.equals("admin")) {
		if (password==123) {
			System.out.println("Login Successful");
		}
		else {
			try {
				throw new InvalidPasswordException();
			}
			catch( InvalidPasswordException e) {
				System.out.println("Invalid password Entered");
		
			}
			
		}
		
	}
	scan.close();
	}

}
