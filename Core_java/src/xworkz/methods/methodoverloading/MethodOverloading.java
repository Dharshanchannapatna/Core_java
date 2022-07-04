package xworkz.methods.methodoverloading;

public class MethodOverloading {
	void  display(Object b) {
		System.out.println("method Stared");
		
	}
	void display(Number n) {
		System.out.println("method ended");
		
	}
	
	public static void main(String[] args) {
	
		MethodOverloading m=new MethodOverloading();
		m.display(null);
		
	}
}
