package com.string;

public class ContainsMethod1 {

	public static void main(String[] args) {
		String s="welcome to javat point";
		if(s.contains(null)) {
		System.out.println("this will give NullPointerExceptions");	
		}
		else {
			System.out.println("not found anything");
		}
		
		
	}

}
