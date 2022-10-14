package com.collection;
import java.util.*;
public class TreeSet3 {

	public static void main(String[] args) {
	TreeSet<Integer> al=new TreeSet<Integer>();
	al.add(23);
    al.add(45);
    al.add(12);
    al.add(37);
    al.add(76);
    System.out.println("minimum value:"+al.pollFirst());
    System.out.println("maximum value:"+al.pollLast());
	}

}
