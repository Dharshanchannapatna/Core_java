package xworkz.collection.set.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
	HashSet<String> hs=new HashSet();
	hs.add("four");
	hs.add("one");
	hs.add("two");
	hs.add("three");
	hs.add("three");
	
	
	System.out.println(hs);
	
	System.out.println("==========");
	
	
	for(String s:hs) {
		System.out.println(s);
	}
	
	
	System.out.println("==========");
	
	Iterator i=hs.iterator();
	
	while(i.hasNext()) {
		
		System.out.println(i.next());
	}
	

	System.out.println("==========");
	
	HashSet<String> hs1=new HashSet();
	hs1.add("nine");
	hs1.add("ten");
	hs1.add("eight");
	hs.addAll(hs1);
	
	System.out.println(hs);
	}

}
