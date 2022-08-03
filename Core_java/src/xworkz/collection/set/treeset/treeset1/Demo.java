package xworkz.collection.set.treeset.treeset1;

import java.util.*;  
class Demo{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
         //set.add(null);
         //set.add(1);
         System.out.println("Intial Set: "+set);  
         System.out.println("========");
         System.out.println("Head Set: "+set.headSet("B"));  
         System.out.println("========");
         System.out.println("SubSet: "+set.subSet("A", "E"));  
         System.out.println("========");
         System.out.println("TailSet: "+set.tailSet("E"));  
 }  
}  