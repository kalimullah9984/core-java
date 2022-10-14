package com.collection;

import java.util.*;

public class CollectionTestSort {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sunflower");
		al.add("Rose");
		al.add("Lotus");
		al.add("MaryGold");
		Collections.sort(al);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
