package com.collection;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentIfAbsent {

	public static void main(String[] args) {
		Map<String, Integer> mapcorn = new HashMap<String, Integer>();
		mapcorn.put("k1", 100);
		mapcorn.put("k3", 300);
		mapcorn.put("k2", 200);
		System.out.println(mapcorn);
		mapcorn.computeIfAbsent("k4", k4 -> 400 + 200);
		mapcorn.computeIfAbsent("k5", k5 -> 500 * 2);
		System.out.println(mapcorn);
	}

}
