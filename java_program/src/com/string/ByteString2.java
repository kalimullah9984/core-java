package com.string;

public class ByteString2 {

	public static void main(String[] args) {
	String str="ABCDE";
	byte[] barr=str.getBytes();
	for(int i=0; i<barr.length; i++) {
	System.out.println(barr[i]);	
	}
	String s2=new String(barr);
	System.out.println(s2);
	}
}
