package com.string;

public class MaximumOccuringCharacterInString {

	public static void main(String[] args) {
	String s="kalimullah";
	int[] arr=new int[127];
	for(int i=0; i<s.length(); i++) {
	arr[s.charAt(i)]=arr[s.charAt(i)]+1;	
	}
	int max=-1;
	char c=' ';
	for(int i=0; i<s.length(); i++) {
	if(max<arr[s.charAt(i)]) {
	max=s.charAt(i);
	c=s.charAt(i);
	 	
	}	
	}
	System.out.println("maximum ocuuring chracter is:"+c);
	}

}
