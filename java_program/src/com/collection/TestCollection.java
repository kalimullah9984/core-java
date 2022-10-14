package com.collection;
import java.util.*;
public class TestCollection {

	public static void main(String[] args) {
	Student s1=new Student(11,"Kaleem",27);	
	Student s2=new Student(12,"Mujeeb",25);
	Student s3=new Student(13,"Javed",26);
  ArrayList<Student> al=new ArrayList<Student>();
  al.add(s1);
  al.add(s2);
  al.add(s3);
 Iterator itr=al.iterator();
 while(itr.hasNext()) {
 Student s=(Student)itr.next();	 
System.out.println(s.rollno+" "+s.name+" "+s.age);	 
 }
  
	}
}
