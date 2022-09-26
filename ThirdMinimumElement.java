package com.yash.practice;

public class ThirdMinimumElement {
	public static int getThirdSmallest(int[] a) {
		int temp;
		// sort the array
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// return third minimum element
		return a[2];
	}

	public static void main(String args[]) {
		int a[] = { 9, 10, 12, 11, 4, 7, 21 };
		System.out.println("Third Smallest: " + getThirdSmallest(a));
	}
}
