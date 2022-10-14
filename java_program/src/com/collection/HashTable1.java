package com.collection;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
Hashtable<Integer,String> ht=new Hashtable<Integer,String>();		
ht.put(103, "Amit");
ht.put(101, "Govind");
ht.put(102, "dinesh");
ht.put(100, "Jaggi");
System.out.println(ht.getOrDefault(101, "not found"));
System.out.println(ht.getOrDefault(105, "not found"));
}

}