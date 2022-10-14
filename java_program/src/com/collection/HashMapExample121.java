package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample121 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "apple");
		hm.put(2, "banana");
		hm.put(3, "Orange");
		hm.put(1, "Papaya");
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}

}
