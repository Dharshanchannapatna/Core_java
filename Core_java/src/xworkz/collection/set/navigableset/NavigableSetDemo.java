package xworkz.collection.set.navigableset;
import java.util.*;
public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(11);
		t.add(12);
		t.add(13);
		t.add(14);
		System.out.println(t);
		
		System.out.println("=======");
		
		
		System.out.println(t.ceiling(11));
		
		System.out.println(t.higher(11));
		
		System.out.println(t.floor(11));
		
		System.out.println(t.lower(10));

		System.out.println(t.pollFirst());
		System.out.println(t);
		
		System.out.println(t.descendingSet());
	}

}
