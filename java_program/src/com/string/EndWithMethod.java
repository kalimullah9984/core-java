package com.string;

public class EndWithMethod {

	public static void main(String[] args) {
		String s1="Delhi is the capital of India";
  Boolean b=s1.endsWith("is");
	System.out.println(b);
	if(s1.endsWith("Delhi")) {
	System.out.println("String end with India");	
	}else{
		System.out.println("it does not end with India");
	}
	}

}
