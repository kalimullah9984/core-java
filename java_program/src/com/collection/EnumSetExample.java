package com.collection;


import java.util.*;
public class EnumSetExample {
enum days{
Monday,Tuesday,Wednesday,thrusday,Friday,Saturday,Sunday;	
}
	public static void main(String[] args) {
		EnumSet<days> set1=EnumSet.allOf(days.class);
		System.out.println("week days"+set1);
		EnumSet<days> set2=EnumSet.noneOf(days.class);
		System.out.println("week days"+set2);
//  	EnumSet<days> set=EnumSet.of(days.Sunday,days.Monday);	
//  Iterator<days> itr=set.iterator();
//  while(itr.hasNext()) {
//	 System.out.println(itr.next()); 
//  }
  	
  
	}

}
