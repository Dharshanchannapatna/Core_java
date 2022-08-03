package xworkz.collection.list.linkedlist;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(20);
	l.add(2);
	l.addFirst(10000);
	System.out.println(l);
	
	System.out.println("======");
	for(Integer p:l) {
		System.out.println(p);
	}
	
	System.out.println("======");
	
	Collections.sort(l);
	Iterator i=l.iterator();
	while(i.hasNext()) {
		 Integer o=(Integer)i.next();
		 System.out.println(o);
	}
	System.out.println("======");
	
l.add(2, 5000);
System.out.println(l);
	
System.out.println(l.size());

System.out.println(l.getFirst());

System.out.println(l.remove(2));
System.out.println(l);
	

	}

}
