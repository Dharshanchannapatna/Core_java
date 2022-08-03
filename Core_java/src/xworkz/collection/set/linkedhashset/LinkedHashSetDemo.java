package xworkz.collection.set.linkedhashset;

import java.util.*;  
class LinkedHashSetDemo{  
 public static void main(String args[]){  
 //Creating HashSet and adding elements  
	 
        LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("One"); 
               set.add("Three"); 
               set.add("Two");
               set.add("Five");
               set.add("Three");   
               set.add("Four");  
            
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  
 }  
}  