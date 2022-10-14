package com.collection;

import java.util.*;

public class ConvertingArraytoList {

	public static void main(String[] args) {
		String[] array = { "java", "Pthon", "PHP","C++" };
		System.out.println("printing Array:" + Arrays.toString(array));
		ArrayList<String> list = new ArrayList<String>();
		for (String lang: array) {
			list.add(lang);
		}
			System.out.println("Priniting List: " +list);
		
	}

}
