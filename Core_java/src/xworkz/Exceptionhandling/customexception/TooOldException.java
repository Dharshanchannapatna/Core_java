package xworkz.Exceptionhandling.customexception;

public class TooOldException extends RuntimeException{
	TooOldException(String msg){
		super(msg);
	}
}
