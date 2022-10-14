package com.collection;
import java.util.*;
import java.io.*;
public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
   al.add("ajay");
   al.add("Vijay");
   al.add("Rakesh");
 try {
	 FileOutputStream fos=new FileOutputStream("File");
	ObjectOutputStream oos=new ObjectOutputStream(fos); 
	oos.writeObject(al);
	fos.close();
	oos.close();
	FileInputStream fis=new FileInputStream("file");
	ObjectInputStream ois=new ObjectInputStream(fis);
	ArrayList list=(ArrayList)ois.readObject();
	System.out.println(list);
 }catch(Exception e) {
	 System.out.println(e);
 }
 
   
	}
}
