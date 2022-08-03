package xworkz.collection.set.treeset.treeset1;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet();
	t.add(10);
	t.add(20);
	t.add(90);
	t.add(60);
	t.add(30);
	t.add(40);
	t.add(50);
	
	for(Integer i:t) {
		System.out.println(i);
	}
	
System.out.println("===========");

	Iterator i=t.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println("===========");
	
	t.pollFirst();
	System.out.println(t);;
	
	
	
	}

}
