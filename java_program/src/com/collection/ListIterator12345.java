package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator12345 {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();	
list.add("Basti");
list.add("Lucknow");
list.add("Gorakhpur");
list.add("Delhi");
ListIterator<String> itr=list.listIterator();
System.out.println("Traversing element inforward direction");
while(itr.hasNext()) {
System.out.println("index:"+itr.nextIndex()+"value:"+itr.next());
}
System.out.println("Traversing element in bacward direction");
while(itr.hasPrevious()) {
	System.out.println("index:"+itr.previousIndex() +"value:"+ itr.previous());	
}
}
}
