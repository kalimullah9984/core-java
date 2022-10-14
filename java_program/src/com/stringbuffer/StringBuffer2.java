package com.stringbuffer;

public class StringBuffer2 {

	public static void main(String[] args) {
StringBuffer sb1=new StringBuffer();
sb1.ensureCapacity(100);
sb1.append("kaleem");
sb1.trimToSize();
System.out.println(sb1.capacity());
	}

}
