package com.array;

import java.util.List;

public class ArrayListProgram {
	
	public static void main(String[] args) {
		List<String> list=List.of("a","b","c");
		list.forEach(a->System.out.println(a));
	}

}
