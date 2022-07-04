package xworkz.blocks;

public class Student {
	static int age;
	static {
		System.out.println("Started");
		age=10;
		
	}

	public static void main(String[] args) {
		
	System.out.println(age);

	}
	static {
		age=20;
	}

}
