package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList10 {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
    al1.add("Kaleem");
    al1.add("Mujeeb");
    al1.add("Abrar");
    ArrayList<String> al2=new ArrayList<String>();
    al2.add("Kaleem");
    al2.add("Farukh");
    al1.retainAll(al2);
    System.out.println("iterating the object after retaining the element");
    Iterator<String> itr=al1.iterator();
    while(itr.hasNext()) {
    System.out.println(itr.next());	
    }
	}

}
