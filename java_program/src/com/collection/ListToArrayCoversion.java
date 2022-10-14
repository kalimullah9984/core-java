package com.collection;
import java.util.*;
public class ListToArrayCoversion {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();	
  list.add("Kaleem");
  list.add("Javed");
  list.add("Salman");
  list.add("imran");
  String[] array= list.toArray(new String[list.size()]);
  System.out.println("Printing Array:"+Arrays.toString(array));
  System.out.println("Printing list:"+list);
	}

}
