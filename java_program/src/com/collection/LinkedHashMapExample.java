package com.collection;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<String,Integer>map=new LinkedHashMap<String,Integer>();
   map.put("K", (130));
   map.put("E", (90));
   map.put("Z", (190));
   for(Map.Entry<String,Integer> m:map.entrySet()) {
	System.out.println(m.getKey()+" :"+m.getValue());   
   }
	}

}
