package com.string;

public class VowelAndConsonants {

	public static void main(String[] args) {
	int cCount=0;
	int vCount=0;
	String s="India is my country";
	s=s.toLowerCase();
	for(int i=0; i<s.length(); i++) {
	if(s.charAt(i)=='a' ||  s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
		vCount++;
	}
	else if(s.charAt(i)>'a' && s.charAt(i)<'z') {
	cCount++;	
	}		
	}
	System.out.println("total num of vowel:"+" "+vCount);
	System.out.println("total num of consonants:"+" "+cCount);
	}

}
