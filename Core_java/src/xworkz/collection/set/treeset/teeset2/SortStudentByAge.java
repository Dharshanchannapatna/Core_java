package xworkz.collection.set.treeset.teeset2;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		
		return x.age - y.age;
	}
	

}
