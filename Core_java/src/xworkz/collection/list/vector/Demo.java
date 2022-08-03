package xworkz.collection.list.vector;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;



public class Demo {

	public static void main(String[] args) {
	Vector<String> v=new Vector();
	v.add("apple");
	v.add("grapes");
	v.add("mango");
	v.addElement("rose");
	v.add("apple");
	v.add("grapes");
	v.add("mango");
	v.addElement("rose");
	v.add("apple");
	v.add("grapes");
	v.add("mango");
	v.addElement("rose");
	v.add("null");
	Enumeration etr=v.elements();
	while (etr.hasMoreElements()) {
		String e=(String)etr.nextElement();
		System.out.println(e);
	}
	System.out.println("========");
	
	System.out.println(v);
	
	System.out.println("========");
	
	Collections.sort(v);
	
	Iterator i=v.iterator();
	while (i.hasNext()) {
	String t=(String) i.next();
	System.out.println(t);
		 
	}
	System.out.println("========");
		
	System.out.println(v.capacity());
	
	System.out.println("========");
	
	System.out.println(v.size());
	
	System.out.println("========");
		
	System.out.println(v.capacity());
	
	

	}

}
