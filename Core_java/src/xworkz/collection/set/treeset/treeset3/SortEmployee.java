package xworkz.collection.set.treeset.treeset3;

import java.util.TreeSet;

public class SortEmployee {

	public static void main(String[] args) {
	Employee e1=new Employee(101,"darshi");
	Employee e2=new Employee(102,"manoj");
	Employee e3=new Employee(109,"nandan");
	SortEmployeeByName u=new SortEmployeeByName();
	TreeSet<Employee>s=new TreeSet(u);
	s.add(e1);
	s.add(e2);
	s.add(e3);
	System.out.println(s);

	}

}
