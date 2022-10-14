package com.stringbuffer;

public class StringBufferCapacity {

	public static void main(String[] args) {
StringBuffer sb=new StringBuffer("kalimullah chaudhary");
StringBuffer sb1=sb.append("hi");
System.out.println(sb.equals(sb1));
System.out.println(sb.indexOf("m"));
System.out.println(sb.length());
System.out.println(sb.lastIndexOf("a"));
StringBuffer sb2=new StringBuffer("kalimullah chaudhary");
System.out.println(sb.equals(sb2));
System.out.println(sb.capacity());
System.out.println(sb1.length());
System.out.println(sb.deleteCharAt(5));
System.out.println(sb.delete(3, 8));

sb.append("hello java");
System.out.println(sb);

	}

}
