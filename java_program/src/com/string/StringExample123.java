package com.string;

public class StringExample123 {

	public static void main(String[] args) {
		String s="My name is Kalimullah khan";
		int count=0;
		for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)=='M' ) {
		count++;	
		}	
		}
		System.out.println("frequency of M  is:"+ " "+count);
		

	}

}
