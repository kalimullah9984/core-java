package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
ArrayList<Student2> al=new ArrayList<Student2>();
al.add(new Student2( 11, "Kaleem",23));
al.add(new Student2( 12, "Salman",24));
al.add(new Student2( 13, "Salam",25));
Collections.sort(al);
for(Student2 s:al)
	System.out.println(s.rollno+" "+s.name+" "+s.age);
	}

}
