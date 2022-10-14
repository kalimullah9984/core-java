package com.string;

public class ReplaceAllMethod {

	public static void main(String[] args) {
		String s1="knowledge is very important";
//		 System.out.println(s1.replace("e", "k"));
		System.out.println(s1.replaceAll(" ","."));
		String s2="null";
		System.out.println(s2.replaceAll(null, ""));
	}

}
