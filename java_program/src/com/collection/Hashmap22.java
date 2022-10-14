package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap22 {

	public static void main(String[] args) {
	Map<Integer,String>	hs=new HashMap<Integer,String>();
	hs.put(11,"Agra");
	hs.put(21,"Jaipur");
	hs.put(31,"Rajkot");
	hs.put(41,"Basti");
	hs.put(51,"Chandigarh");
	System.out.println(hs);
	for(Map.Entry<Integer, String> m:hs.entrySet()) {
	System.out.println(m.getKey()+":"+m.getValue());	
	}
	hs.replace(21, "Cuttack");
	for(Map.Entry<Integer, String> m:hs.entrySet()) {
		System.out.println(m.getKey()+":"+m.getValue());	
		}
	System.out.println("Updated List");
	hs.replace(31, "Ludhiana");
	for(Map.Entry<Integer, String> m:hs.entrySet()) {
		System.out.println(m.getKey()+":"+m.getValue());	
		}
	System.out.println("Updated List");
	hs.replaceAll((k,v) -> "London");
	for(Map.Entry<Integer, String> m:hs.entrySet()) {
		System.out.println(m.getKey()+":"+m.getValue());	
		}
	}

}
