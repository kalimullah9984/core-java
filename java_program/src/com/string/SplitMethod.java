package com.string;

public class SplitMethod {

	public static void main(String[] args) {
	String s1="welcome to java t point";
	for(String s:s1.split("\\s",0)) {
		System.out.println(s);	
		}
	for(String s:s1.split("\\s",1)) {
		System.out.println(s);	
		}

	for(String s:s1.split("\\s",2)) {
		System.out.println(s);	
		}
for(String s:s1.split("\\s",3)) {
System.out.println(s);	
}
	}

}
