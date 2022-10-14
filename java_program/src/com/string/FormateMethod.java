package com.string;

public class FormateMethod {

	public static void main(String[] args) {
	String s1=String.format("%d", 101)	;
String s2=String.format("|%d|", 110);
String s3=String.format("|%-10d|", 210);
String s4=String.format("|%10d|", 20);
String s5=String.format("|%010d|", 300);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);

	}

}
