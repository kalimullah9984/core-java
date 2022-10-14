package com.collection;
import java.util.*;
public class LinkedHashSet3 {

	public static void main(String[] args) {
	LinkedHashSet<String>lhs=new LinkedHashSet<String>();	
  lhs.add("People");
  lhs.add("Good");
  lhs.add("Flower");
  System.out.println(lhs);
  System.out.println(lhs.remove("Good"));
  System.out.println(lhs);
  System.out.println(lhs.remove("flow"));
	}

}
