package com.string;

public class GetCharsMethod {

	public static void main(String[] args) {
	String s=new String("welcometojavatpoint");	
	char[] ch=new char[20];
	try{
	s.getChars(0, 19, ch, 0);	
	System.out.println(ch);	
	}catch(Exception ex) {
	System.out.println(ex);	
	}
	
	}

}
