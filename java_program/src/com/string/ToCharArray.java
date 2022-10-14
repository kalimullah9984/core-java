package com.string;

public class ToCharArray {

	public static void main(String[] args) {
	String s1="wlcome to javat point";	
    char[] ch= s1.toCharArray();
    int len=ch.length;
    System.out.println("char array length:"+len);
    System.out.println("char array elements:");
    for(int i=0; i<ch.length; i++) {
    System.out.println(ch[i]);	
    }
	}

}
