package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>();
map.put(111, "Kaleem");
map.put(222, "Salman");
map.put(333, "Mujeeb");
for(Map.Entry<Integer,String> s:map.entrySet()) {
	System.out.println(s.getKey()+": "+s.getValue());
}


	}

}
