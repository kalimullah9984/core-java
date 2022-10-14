package com.collection;

import java.util.HashMap;
import java.util.Map;

public class TreeMap12 {



	public static void main(String[] args) {
	Map	<Integer,String> map=new HashMap<Integer,String>();
map.put(15, "Javed");
map.put(16, "Kaleem");
map.put(17, "Salam");
System.out.println("initial Map"+map);
//map.put(17, "Mujeeb");
//System.out.println("updated map"+map);
map.remove( 15);
System.out.println(map);
	}

}
