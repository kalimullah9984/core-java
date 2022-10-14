package com.collection;
import java.util.*;
public class LinkedHashSet1 {

	public static void main(String[] args) {
	Set<String>	set=new LinkedHashSet();
    set.add("Amit");
    set.add("David");
    set.add("Lion");
  //  System.out.println(set);
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
		System.out.println(iterator.next());
	set.add("yarwan");
	System.out.println(set);
	}
	}

}
