package com.string;

public class StringExample1 {

	public static void main(String[] args) {
	String s="Indepence day";
	int count=0;
	for(int i=0; i<s.length(); i++) {
	if(s.charAt(i)=='e') {
		count++;
	}	
	}
	System.out.println("frequency of e is:"+count);
	}

}
