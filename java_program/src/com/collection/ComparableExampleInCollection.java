package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExampleInCollection {

	public static void main(String[] args) {
	ArrayList<Teacher> al=new ArrayList<Teacher>();
	al.add(new Teacher(102,"Kaleem",27));
	al.add(new Teacher(106,"Salman",25));
	al.add(new Teacher(104,"Javed",31));
	Collections.sort(al);
	for(Teacher t:al) {
	System.out.println(t.rollno+" "+t.name+" "+t.age);	
	}
	}

}
