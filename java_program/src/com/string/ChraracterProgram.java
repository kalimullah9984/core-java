package com.string;

public class ChraracterProgram {

	public static void main(String[] args) {
		String s1="Abrar";
        String s2="Ahmad";
      String  s3=s1.concat(s2);
        System.out.println(s3);
        for(int i=0; i<s3.length(); i++) {
        System.out.println(s3.charAt(i));	
        }
	}

}
