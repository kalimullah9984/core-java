package com.collection;
import java.util.*;
public class HashSet4 {

	public static void main(String[] args) {
	
    HashSet<String> set=new HashSet();
    set.add("Imran");
    set.add("Shamim");
    set.add("Javed");
    set.add("Ameen");
    Iterator<String> i=set.iterator();
    while(i.hasNext()) {
    System.out.println(i.next());	
    }
	}

}
