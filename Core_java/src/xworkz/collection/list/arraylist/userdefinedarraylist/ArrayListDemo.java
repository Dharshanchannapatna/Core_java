package xworkz.collection.list.arraylist.userdefinedarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	Student s1=new Student(1,"tom",21);
	Student s2=new Student(2,"jerry",22);
	Student s3=new Student(3,"lion",23);
	
	ArrayList l=new ArrayList();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	
	l.addAll(l);
	  System.out.println("After invoking add(E e) method: "+l); 
	
	Iterator i=l.iterator();
	while(i.hasNext()) {
		 Student o=(Student)i.next();
		System.out.println(o.rollNo+" "+o.name+" "+o.age);
		
	}

	}

}
