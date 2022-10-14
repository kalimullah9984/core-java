package com.collection;
import java.util.*;
 class TreeSet4 {
	 public static void main(String args[]){  
		  TreeSet<String> set=new TreeSet<String>();  
		         set.add("A");  
		         set.add("B");  
		         set.add("C");  
		         set.add("D");  
		         set.add("E");
		         System.out.println("initial set:"+set);
		         System.out.println("Reverse Set:"+set.descendingSet());
		         System.out.println("HeadSet:"+set.headSet("C",true));
		         System.out.println("Sub Set:"+set.subSet("A", false, "E", false));
		         System.out.println("TailSet:"+set.tailSet("C", false));
}
 }
