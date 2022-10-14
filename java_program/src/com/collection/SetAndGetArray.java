package com.collection;
import java.util.*;
public class SetAndGetArray {
	public static void main(String[] args) {
ArrayList<Integer>list=new ArrayList<Integer>();
list.add(56);
list.add(42);
list.add(100);
list.add(200);
System.out.println(list.get(1));
list.set(2, 23);
for(int number:list) {
System.out.println(number);	
}
}
}
