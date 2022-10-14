package com.collection;
import java.util.*;
public class ReverseCollection {

	public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();	
ll.add("Kaleem");
ll.add("Mujeeb");
ll.add("Shamim");
Iterator itr=ll.descendingIterator();
while(itr.hasNext()) {
System.out.println(itr.next()); 
}
	}

}
