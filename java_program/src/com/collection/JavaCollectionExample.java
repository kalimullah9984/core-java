package com.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JavaCollectionExample {

	public static void main(String[] args) {
	Set<Integer> set=new HashSet<Integer>();	
set.add(2);
set.add(4);
System.out.println(set);
set.add(3);
		
		Collections.addAll(set,6,7,8,9);
		System.out.println(set);
		int size=set.size();
		System.out.println("size of the collection:"+size);
		Boolean val=set.contains(5);
		if(val) {
		System.out.println("5 is preset in the collection");	
		}else {
			System.out.println("5 is not present in the collection");
		}
		set.clear();
		System.out.println(set);
	}

}
