package xworkz.oops.encapulation;

public class Employee {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
class TestEmployee{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("darshi");
		String name=e.getName();
		System.out.println(name);
	}
}
