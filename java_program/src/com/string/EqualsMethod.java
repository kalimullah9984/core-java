package com.string;

public class EqualsMethod {

	public static void main(String[] args) {
String s1="English";
String s2="Hindi";
String s3="Biology";
String s4="Grammer";
if(s3.equals(s4)) {
	System.out.println("case sensitive");
}else if(s3.equalsIgnoreCase(s4)) {
	System.out.println("not a case sensitive");
}else {
	System.out.println("other will be executed");
}
	}

}
