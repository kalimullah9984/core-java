package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class TestSort3Example {

	public static void main(String[] args) {
		ArrayList<Student3> al = new ArrayList<Student3>();
		al.add(new Student3(103, "kaleem", 11));
		al.add(new Student3(100, "Hakeem", 15));
		al.add(new Student3(105, "Saleem", 10));
		Comparator<Student3> cm1 = Comparator.comparing(Student3::getName);
		Collections.sort(al, cm1);
		System.out.println("sorting the name");
		for (Student3 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		Comparator<Student3> cm2 = Comparator.comparing(Student3::getAge);
		Collections.sort(al,cm2);
		System.out.println("sorting the age");

		for(Student3 st:al) {
		System.out.println(st.rollno + " " + st.name + " " + st.age);	
		}
	}

}
