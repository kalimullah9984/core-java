package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEXample45 {

	public static void main(String[] args) {
	Map<Integer,String>	map=new HashMap<Integer,String>();
  map.put(1, "India");
  map.put(2, "SriLanka");
  map.put(3, "Nepal");
  for(Entry<Integer, String> Elemap:map.entrySet()) {
	int key=(int)Elemap.getKey();
	String value=(String)Elemap.getValue();
	System.out.println(key+" :"+value);
  }
	}

}
