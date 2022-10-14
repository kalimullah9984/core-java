package com.collection;

import java.util.*;

enum days {
	Monday, Tuesday, Wednesday, thrusday, Friday, Saturday, Sunday;
}

public class EnumMap1 {

	public static void main(String[] args) {
		EnumMap<days, String> map = new EnumMap<days, String>(days.class);
		map.put(days.Monday, "1");
		map.put(days.Sunday, "3");
		map.put(days.Friday, "2");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
