package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassprogram {

	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(78);
	list.add(123);
	list.add(98);
	list.add(221);
	list.add(56);
	list.add(90);
	list.add(45);
	list.add(391);
System.out.println("maximum value:"+Collections.max(list));
System.out.println("minimum value:"+Collections.min(list));
	}

}
