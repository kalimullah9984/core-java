package com.collection;

import java.util.*;

class Copy{
	int id;
	String name, auther, publisher;
	int quantity;

	Copy(int id, String name, String auther, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ListProgram101 {

	public static void main(String[] args) {
		ArrayList<Copy> list = new ArrayList<Copy>();
		Copy c1 = new Copy(101, "kaleem", "joseph", "RK", 10);
        Copy c2= new Copy(102, "Salman", "khan", "Bhatpara", 11);
        Copy c3= new Copy(103, "Aadilnoor", "khan", "Blaipur", 12);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        for (Copy copy : list) {
        	System.out.println(copy.id+" "+copy.name+" "+copy.auther+" "+copy.publisher+" "+copy.quantity);
			
		}
	}

}
