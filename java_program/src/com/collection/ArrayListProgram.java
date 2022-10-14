package com.collection;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
      al.add("jhon");
      al.add("james");
      al.add("Thomas");
      System.out.println(al);
      al.add(1,"Danial");
      System.out.println(al);
      ArrayList<String> al2=new ArrayList<String>();
      al2.add("David");
      al2.add("Liam");
      al.addAll(al2);
      System.out.println(al);
      ArrayList<String> al3=new ArrayList<String>();
      al3.add("Kaleem");
      al3.add("Mujeeb");
      al.addAll(al3);
      System.out.println(al);
      al.remove(3);
      System.out.println(al);
      al.clear();
      System.out.println(al);
	}

}
