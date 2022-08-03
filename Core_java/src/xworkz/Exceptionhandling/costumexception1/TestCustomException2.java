package xworkz.Exceptionhandling.costumexception1;

public class TestCustomException2 {

	public static void main(String[] args) {
	try
	{
		throw new MyCustomException("exception");
	}
catch(MyCustomException e)
	{
	System.out.println("caught the exception");
	//e.printStackTrace();
	System.out.println(e.getMessage());
	}
	System.out.println("rest of code");
	}

}
