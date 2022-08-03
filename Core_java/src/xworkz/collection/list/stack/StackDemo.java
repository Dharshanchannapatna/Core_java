package xworkz.collection.list.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack s=new Stack();
	s.push(100);
	s.addElement(102);
	s.push(103);
	s.addElement(104);
	s.push(105);
	s.addElement(106);
	s.add(107);
	s.add(108);
	s.add(109);
	s.add(110);
	s.add(111);

	System.out.println(s);
	System.out.println("========");
	
	System.out.println(s.capacity());
	
	System.out.println("========");
	
	System.out.println(s.pop());
	System.out.println(s);
	
	System.out.println("========");
	
	System.out.println(s.peek());
	System.out.println(s);

	}

}
