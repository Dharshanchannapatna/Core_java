package xworkz.Constructor.Constructoroverloading;

public class ConstructorOverloadingDemo {
	ConstructorOverloadingDemo(int x){
		
		System.out.println("started");
	}
ConstructorOverloadingDemo(){
		this(10);
		System.out.println("Ended");
	}
	public static void main(String[] args) {
		ConstructorOverloadingDemo a=new ConstructorOverloadingDemo(10);
	

	}

}
