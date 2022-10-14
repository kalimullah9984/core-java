package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample55 {

	public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<Integer,String>	();
map.put(101, "Sachin");
map.put(102, "Ganguly");
map.put(103, "Rahul");
//System.out.println(map.keySet());
for(Map.Entry<Integer, String> m:map.entrySet()) {
	int key=m.getKey();
	System.out.println(key);
}
	}

}
