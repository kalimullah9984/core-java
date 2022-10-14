package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
	Map<Integer,String> m1=new HashMap<Integer,String>(); 	
	Map<Integer,String> m2=new HashMap<Integer,String>(); 	
	m1.put(110, "Kaleem");
	m1.put(120, "Mujeeb");
	m1.put(150, "Salman");
  m2.put(130, "Azaan");
  m2.put(160, "Ehsan");
  m2.put(230, "Sufiyan");
  System.out.println(m1);
  System.out.println(m2);
	}

}
