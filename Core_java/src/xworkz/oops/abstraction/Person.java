package xworkz.oops.abstraction;

public  abstract class Person {
	abstract void work();
}
class Employee extends Person{
	@Override
	void work() {
		System.out.println("working");
	}
}
class User{
	public static void main(String[] args) {
		Person p=new Employee();
		p.work();
	}
}