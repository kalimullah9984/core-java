package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
Vector<String> v=new Vector<String>();
v.add("Kaleem");
v.add("Mujeeb");
v.add("Salam");
v.add("Salman");
Enumeration e=v.elements();
while(e.hasMoreElements()) {
System.out.println(e.nextElement());	
}
	}

}
