package com.collection;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>();
		 map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");  
	      System.out.println("descendingMap: "+((TreeMap<Integer,String>) map).descendingMap());
	      System.out.println("headMap: "+((TreeMap<Integer, String>) map).headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+((TreeMap<Integer, String>) map).tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+((TreeMap<Integer,String>) map).subMap(100, false, 102, true));  
	}

}
