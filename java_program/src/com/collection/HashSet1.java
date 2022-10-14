package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet();
     set.add("Five");
     set.add("Two");
     set.add("One");
     set.add("Four");
     set.add("Three");
     Iterator<String> itr=set.iterator();
     while(itr.hasNext()) {
    System.out.println(itr.next());	 
     }
	}

}
