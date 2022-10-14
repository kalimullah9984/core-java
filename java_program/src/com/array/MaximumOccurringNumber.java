package com.array;

public class MaximumOccurringNumber {

	public static void main(String[] args) {
		int[] a = { 4, 1, 3, 2, 5, 6 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("minimum number is:" + min);
		System.out.println("maximum number is:" + max);
	}

}
