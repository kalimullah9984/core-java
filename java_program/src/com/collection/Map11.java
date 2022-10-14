package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Map11 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Amit");
		map.put(100, "Vijay");
		map.put(105, "Ajay");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
