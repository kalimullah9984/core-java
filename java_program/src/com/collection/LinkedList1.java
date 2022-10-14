package com.collection;
import java.util.*;
public class LinkedList1 {
public static void main(String[] args) {		
LinkedList<String> ll=new LinkedList<String>();
ll.add("Rabbit");
ll.add("Rat");
ll.add("Cat");
System.out.println(ll);
LinkedList<String> ll1=new LinkedList<String>();
ll1.add("Dog");
ll1.add("Elephant");
ll.addAll(ll1);
ll.add(2,"jackal");
System.out.println(ll);

System.out.println(ll);
LinkedList<String> ll2=new LinkedList<String>();
ll2.add("lion");
ll2.add("tiger");

ll.addAll(ll2);
System.out.println(ll);
ll.remove("Cat");
System.out.println(ll);
LinkedList<String> ll3=new LinkedList<String>();
ll3.add("Fox");
ll3.add("Dear");
ll.addAll(4,ll3);
System.out.println(ll);
ll.addFirst("Bear");
ll.addLast("Monkey");
System.out.println(ll);
}
}
