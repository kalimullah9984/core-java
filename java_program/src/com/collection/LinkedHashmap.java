package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {

	public static void main(String[] args) {
Map<Integer,String> map=new LinkedHashMap<Integer,String>();
map.put(101, "Arjun");
map.put(102, "Sahil");
map.put(103, "Ajay");
System.out.println("keys:"+map.keySet());
System.out.println("value:"+map.values());
System.out.println("keys,value:"+map.entrySet());
	}

}
