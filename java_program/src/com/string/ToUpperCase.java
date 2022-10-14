package com.string;

import java.util.Locale;

public class ToUpperCase {

	public static void main(String[] args) {
	String str="core java";
    String turkish=str.toUpperCase(Locale.forLanguageTag("tr"));
    String english=str.toUpperCase(Locale.forLanguageTag("en"));
    System.out.println(turkish);
	System.out.println(english);
	}

}
