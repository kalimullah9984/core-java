package com.collection;

import java.util.concurrent.ConcurrentHashMap;

public class JavaConcurrent {

	public static void main(String[] args) {
	ConcurrentHashMap<String,Integer> chp=new 	ConcurrentHashMap<String,Integer>();
	chp.put("AAA", 10);
	chp.put("BBB", 30);
	chp.put("CCC", 50);
	chp.put("DDD", 100);
	chp.put("EEE", 250);
System.out.println(chp);

System.out.println("is present250:"+" "+chp.containsValue(250));
	
	}

}
