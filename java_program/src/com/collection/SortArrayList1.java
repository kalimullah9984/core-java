package com.collection;
import java.util.*;
public class SortArrayList1 {

	public static void main(String[] args) {
ArrayList<String> list1=new ArrayList<String>();		
list1.add("Papaya");
list1.add("Orange");
list1.add("Lemon");
list1.add("PineApple");
Collections.sort(list1);
for(String fruit:list1) {
System.out.println(fruit);	
}
System.out.println("Sorting Number");
ArrayList<Integer> list2=new ArrayList<Integer>();
list2.add(43);
list2.add(67);
list2.add(22);
list2.add(16);
Collections.sort(list2);
for(Integer num:list2) {
System.out.println(num);	
}
	}

}
