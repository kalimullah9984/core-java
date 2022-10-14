package com.string;

public class LengthMethod {

	public static void main(String[] args) {
	String str="welcome";	
   int size=str.length();
   System.out.println(size);
   for(int i=0; i<size; i++) {
	System.out.print(str.charAt(str.length()-i-1)); 
	
   }
  if(size>0) {
	System.out.println("print java");  
  }
  else {
	  System.out.println("nothing");
  }
	}

}
