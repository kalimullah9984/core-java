package com.stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("kalimullah chaudhary"); 
		System.out.println(sb.replace(2, 8, "r"));
System.out.println(sb.length());
System.out.println(sb.insert(4, "d"));

System.out.println(sb.reverse());
System.out.println(sb.replace(2, 6, "r"));
	}

}
