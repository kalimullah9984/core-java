package com.collection;


	import java.util.HashMap;
	import java.util.Map;



	public class Salam {
		

		public static void main(String[] args) {
		Map<Integer,Mujeeb> mp=new HashMap<Integer,Mujeeb>();
		Mujeeb b1=new Mujeeb(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Mujeeb b2=new Mujeeb(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		Mujeeb b3=new Mujeeb(103,"Operating System","Galvin","Wiley",6);  
	  mp.put(1, b1);
	  mp.put(2, b2);
	  mp.put(3, b3);
	  for(Map.Entry<Integer, Mujeeb> entry:mp.entrySet()) {
		int key=entry.getKey();
		Mujeeb b=entry.getValue();
		System.out.println(key+" "+"Detail");
		System.out.println(b.id+" "+b.name+" "+b.auther+" "+b.publisher+" "+b.salary);
	  }
		}


	}

