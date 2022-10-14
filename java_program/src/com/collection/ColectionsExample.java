package com.collection;
import java.util.*;
public class ColectionsExample {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();	
  list.add("C");
  list.add("Core java");
  list.add("Advance java");
  System.out.println(list);
  Collections.addAll(list,"Jsp","Servlet");
  System.out.println(list);
  String[] str= {"C++","PHP"};
  Collections.addAll(list,str);
  System.out.println(list);
	}

}
