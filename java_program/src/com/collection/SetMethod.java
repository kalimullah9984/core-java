package com.collection;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethod {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("kaleem");
		set1.add("mujeeb");
		set1.add("mujahid");
		set1.add("Kalam");
//    System.out.println(set1);

		for (String string : set1) {
			if (string.equalsIgnoreCase("Mujeeb")) {
				System.out.println(string);
			}
		}

	}

}
