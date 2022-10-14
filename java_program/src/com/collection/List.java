package com.collection;
import java.util.*;
public class List {

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();		
   list.add("Apple");
   list.add("Papaya");
   list.add("Grape");
   list.add("Mango");
   System.out.println(list.get(2)); 
   list.set(3, "Orange");
   for(String fruit:list) {
	System.out.println(fruit);   
   }
	}

}
