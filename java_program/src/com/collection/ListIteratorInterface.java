package com.collection;
import java.util.*;
public class ListIteratorInterface {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Amit");
	al.add("Pranav");
    al.add("Abhinav");
    al.add("Mukul");
    ListIterator<String> itr=al.listIterator();
    	System.out.println("Traversing element in forward direction");
    	 while(itr.hasNext()) {
    		 System.out.println("index:"+itr.nextIndex()+"value:"+itr.next());
    }
    System.out.println("Traversing element in backward direction");	 
    	while(itr.hasPrevious()) {
    	System.out.println("index:"+itr.previousIndex()+"value:"+itr.previous());	
    	} 
    	 
	}
	}



