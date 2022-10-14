package com.collection;
import java.util.*;
public class PrintListToarray {

	public static void main(String[] args) {
	ArrayList<String> fruitList=new ArrayList<String>();	
fruitList.add("Mango");
fruitList.add("Banana");
fruitList.add("Carrot");
fruitList.add("Beat");
String[] array=fruitList.toArray(new String[fruitList.size()]);
System.out.println("printing array:"+Arrays.toString(array));
System.out.println("printing list:"+fruitList);
	}

}
