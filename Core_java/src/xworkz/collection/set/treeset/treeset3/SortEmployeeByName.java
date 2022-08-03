package xworkz.collection.set.treeset.treeset3;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee>{
	public int compare(Employee x,Employee y) {
		return (x.name.compareTo(y.name));
		
	}

}
