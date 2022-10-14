package com.collection;
import java.util.*;
public class HashSet3 {

	public static void main(String[] args) {
	HashSet<String> set=new HashSet();
	set.add("Vijay");
	set.add("Murli");
    set.add("Jack");
    set.add("Ayan");
    System.out.println(set);
    set.remove("Murli");
    System.out.println(set);
  HashSet<String> set1=new HashSet();
  set1.add("Akhand");
  set1.add("Arpit") ;
  set.addAll(set1);
  System.out.println(set);
  set.removeAll(set1);
  System.out.println(set);
  set.removeIf(str ->str.contains("Ayan"));
  System.out.println(set);
  set.clear();
  System.out.println(set);
  
	}
}
