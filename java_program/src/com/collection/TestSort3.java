package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class TestSort3 {

	public static void main(String[] args) {
	ArrayList al= new ArrayList();	
al.add(Integer.valueOf(120));
al.add(Integer.valueOf(213));
al.add(430);
Collections.sort(al);
Iterator itr=al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
