package xworkz.collection.list.arraylist.arraylist1;
import java.awt.List;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
	ArrayList<String> a=new ArrayList();
	a.add("tom");
	a.add("jerry");
	a.add("cat");
	a.add("rat");
	System.out.println(a);
	
	System.out.println("--------");
	
	//using for each loop
	for(String e:a) {
		System.out.println(e);
	}
	
	System.out.println("--------");
	
	Collections.sort(a);
	//using iterator
	Iterator b=a.iterator();
	while(b.hasNext()){
		System.out.println(b.next());
		a.set(1, "t");
		System.out.println(a);
	}
	
	
	
	}

	
}
