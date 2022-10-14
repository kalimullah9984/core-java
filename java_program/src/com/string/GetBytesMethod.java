package com.string;

public class GetBytesMethod {

	public static void main(String[] args) {
	String s="abcdefgh";	
   byte[] barr=s.getBytes();
   for(int i=0; i<barr.length; i++) {
	System.out.println(barr[i]);   
   }
   String s1=new String(barr);
   System.out.println(s1);
	}

}
