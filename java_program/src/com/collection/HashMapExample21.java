package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample21 {

	public static void main(String[] args) {
Map<Integer,String> mp=new HashMap<Integer,String>();		
mp.put(11, "Potato");
mp.put(21, "Tomato");
mp.put(31, "Ginger");
mp.put(41, "Bottleguard");
System.out.println(mp);
mp.remove(11);
System.out.println(mp);
mp.remove(31);
System.out.println(mp);
mp.replace(41, "Brinjal");
System.out.println(mp);
mp.remove(21, "Tomato");
System.out.println(mp);

System.out.println(mp.isEmpty());
mp.clear();
System.out.println(mp);
	}

}
