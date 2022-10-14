package com.array;

import java.util.Scanner;

public class JavaLogic {

	public static void main(String[] args) {
		float no;
		int output=0;
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		no=sc.nextFloat();
		if(no>=10.5 && no<=11) {
			output=11;
			System.out.println(output);
		}
		else if(no<10.5 && no>=10) {
			output=10;
			System.out.println(output);
		}
		else {
			System.out.println("Invalid Number");
		}

	}

}
