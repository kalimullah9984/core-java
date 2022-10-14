package com.collection;

public class Teacher implements Comparable<Teacher> {
int rollno;
String name;
int age;
Teacher(int rollno, String name,int age){
this.rollno=rollno;
this.name=name;
this.age=age;
}
public int compareTo(Teacher t) {
if(age==t.age) {
	return 0;
}
else if(age<t.age) {
return 1;	
}
else {
	return -1;
}
}
}
