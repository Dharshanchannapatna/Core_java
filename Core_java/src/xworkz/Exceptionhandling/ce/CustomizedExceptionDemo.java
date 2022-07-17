package xworkz.Exceptionhandling.ce;

import java.util.Scanner;


public class CustomizedExceptionDemo{
	  public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		
		 System.out.println("Enter age:");
		 int age=Scan.nextInt();
		 if(age<18)
		 {
			throw new TooYoungException("please wait somemore time...u will get match");
		 }
		 else if(age>60){
			 throw new TooOldException("ur age already closed...no chance of getting married");
		 }
		 else
		 {
			 System.out.println("you wiil get match details soon by e-mail");
		 }
			 
	}
  }

