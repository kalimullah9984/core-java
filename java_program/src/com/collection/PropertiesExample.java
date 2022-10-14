package com.collection;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("DBProperties.properties");
		Properties p = new Properties();

		p.load(reader);

		System.out.println(p.getProperty("system"));
		System.out.println(p.getProperty("oracle"));
	}
}
