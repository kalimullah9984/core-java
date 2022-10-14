package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", (100));
		map.put("b", (200));
		map.put("c", (300));
		map.put("d", (400));
		for (Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " :" + m.getValue());
		}
	}

}
