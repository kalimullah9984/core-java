package com.collection;
import java .util.*;
 class Children{
	int empid;
	String name;
String getName() {
	return this.name;
}
void setName(String name) {
	this.name=name;
}
int getId() {
	return this.empid;
}
void setid(int a) {
	this.empid=a;
}	
}
public class ClassCastException {

	public static void main(String[] args) {
	
    Children c1=new Children();
    Children c2=new Children();
    Set<Children> set=new TreeSet<Children>();	
    set.add(c1);
    set.add(c2);
    System.out.println("The program has been successfully executed");
	}
}
