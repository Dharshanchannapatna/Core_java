package xworkz.oops.encapulation;

public class ClassPerson {
	private int age;
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge () {
		return age;
	}
}
class Testperson{
	public static void main(String[] args) {
		ClassPerson c=new ClassPerson();
		c.setAge(18);
		System.out.println(c.getAge());
		
	}
}