package xworkz.collection.set.treeset.teeset2;

import java.util.Iterator;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
	Student s1=new Student(22,"tom");
	Student s2=new Student(23,"jerry");
	Student s3=new Student(24,"lion");
	SortStudentByAge age =new SortStudentByAge();
     TreeSet<Student> tr=new TreeSet(age);
     tr.add(s1);
     tr.add(s2);
     tr.add(s3);
     Iterator itr=tr.iterator()	;
     while(itr.hasNext()) {
    	  Student s=(Student)itr.next();
    	  System.out.println(s);
     }
     }

}
