package xworkz.collection.list.arraylist.arraylist1;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
	ArrayList<Integer>l=new ArrayList <Integer>();
	l.add(100);
	l.add(200);
	l.add(42);
	l.add(100);
	//for(int a:l) {
		//System.out.println(l);
		
	//}
	
	
	System.out.println(l);
	System.out.println(l.size());
    System.out.println(l.contains(42));
    System.out.println(l.get(2));
    System.out.println(l.containsAll(l));
    System.out.println(l.isEmpty());
    l.remove(2);
    System.out.println(l);
    System.out.println(l.indexOf(200));
    System.out.println(l.lastIndexOf(200));
    l.add(2, 2);
    System.out.println(l);
    l.clear();
    System.out.println(l);
   
  
    
	};;;
}
