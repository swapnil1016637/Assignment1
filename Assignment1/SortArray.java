package com.yash.practice;

//Sort Array On The Basis Of Unit Place
public class SortArray {

	public static void main(String[] args) {
		int ar[] = { 100, 2, 3, 91, 12, 13, 19, 81, 9, 10 };

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] % 10 == i) {
					System.out.print(ar[j] + "\t");
				}
			}
		}
	}

}
