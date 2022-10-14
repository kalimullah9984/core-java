package com.collection;
import java.util.*;
public class LinkedArrayList1 {

	public static void main(String[] args) {
LinkedList<String> al=new LinkedList<String>();
al.add("Kaleem");
al.add("Mujeeb");
al.add("Javed");
Iterator<String> itr=al.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());	
}

	}

}
