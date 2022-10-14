package com.collection;

import java.util.*;

class Book {
	int id;
	String name, auther, publisher;
	int quantity;

	Book(int id, String name, String auther, String publisher, int quantity) {
		this.id = id;
		this.name=name;
		this.auther = auther;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ArrayList20 {

	public static void main(String[] args) {
	ArrayList<Book> al=new ArrayList<Book>();	
Book b1=new Book(11,"Philip","Stephen","Chetan",100);
Book b2=new Book(22,"Symond","Jack","Bharat",200);
Book b3=new Book(33,"David","Andrew","ketaki",50);
al.add(b1);
al.add(b2);
al.add(b3);
Iterator itr=al.iterator();
for(Book b:al) {
	System.out.println(b.id+" "+b.name+" "+b.auther+" "+b.publisher+" "+b.quantity);
}
	}

}
