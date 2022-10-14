package com.collection;

import java.util.Comparator;

public class Student3 implements Comparator<Student3> {
int rollno;
String name;
int age;
 Student3(int rollno,String name,int age){
this.rollno=rollno;
this.name=name;
this.age=age;
}
public int getRollno() {
	return rollno;
}
public void setRollno( int rollno) {
	this.rollno=rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}
@Override
public int compare(Student3 o1, Student3 o2) {
	// TODO Auto-generated method stub
	return 0;
}
}




