package com.stringbuffer;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("kaleem");
		sb.setCharAt(2, 'n');
		System.out.println(sb);
		sb.setLength(3);
System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());

	}
}
