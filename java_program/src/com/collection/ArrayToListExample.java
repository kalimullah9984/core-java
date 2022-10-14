package com.collection;
import java.util.*;
public class ArrayToListExample {
	public static void main(String args[]){  
		//Creating Array  
		String[] array={"Java","Python","PHP","C++"};  
		System.out.println("Printing Array: "+Arrays.toString(array));  
		//Converting Array to List  
		ArrayList<String> list=new ArrayList<String>();  
		for(String lang:array){  
		list.add(lang);  
		}  
		System.out.println("Printing List: "+list);  
		  
		}  
		}  

