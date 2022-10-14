package com.collection;
import java.util.HashMap;
import java.util.Map;
public class HashMapProgram100 {

	private static Object Map;

	public static void main(String[] args) {
Map<Integer,String> map=new	HashMap<Integer,String>();
System.out.println(map);
  map.put(1, "Mumbai");
  map.put(2, "Lucknow");
  map.put(3, "Kanpur");
  System.out.println(map);
 for(Map.Entry<Integer,String> m:map.entrySet()) {
	System.out.println(m.getKey()+":"+m.getValue());
 } 
 map.putIfAbsent(5, "Chennai");
 System.out.println(map);
 for(Map.Entry<Integer,String> m :map.entrySet()) {
	System.out.println(m.getKey()+":"+m.getValue()); 
 }
 Map<Integer,String> hm=new	HashMap<Integer,String>();
 hm.put(6,"hydrabad");
 hm.putAll(hm);
 System.out.println(hm);
 for(Map.Entry<Integer,String> m :hm.entrySet()) {
System.out.println(m.getKey()+":"+m.getValue());	 
 }
	}

}
