package com.string;

public class Stringprogram {

	public static void main(String[] args) {
String s1= "kalimullah is going to market";
 

System.out.println("returning words");
String[] arr=s1.split("s",1);
for(String s:arr) {
System.out.println(s);	
}
System.out.println("split array length:"+" "+arr.length);
	}

}
