package xworkz.collection.maps.hashmap;

import java.util.*;  
public class HashMapDemo{  
 public static void main(String args[]){  
	 
   HashMap<Integer,String> map=new HashMap<Integer,String>();  
   map.put(1,"Mango");   
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");   
       
   System.out.println("Iterating Hashmap...");  
   
   for(Map.Entry<Integer, String> m: map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
   
}  
