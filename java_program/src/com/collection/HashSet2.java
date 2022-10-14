package com.collection;
import java.util.*;
public class HashSet2 {

	public static void main(String[] args) {
	HashSet<String> set=new HashSet();
	set.add("Vijay");
    set.add("Ajay");
    set.add("Vijay");
    set.add("Ravi");
    Iterator<String> i=set.iterator();
    while(i.hasNext()) {
    System.out.println(i.next());	
    }
	}

}
