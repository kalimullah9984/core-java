package com.collection;

import java.util.*;



public class CollectionSortExample {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();	
	al.add("Orange");
	al.add("PineApple");
	al.add("Banana");
	al.add("Carrot");
	Collections.sort(al,Collections.reverseOrder());
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
