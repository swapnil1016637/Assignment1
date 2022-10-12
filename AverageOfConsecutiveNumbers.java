package com.yash.practice;

public class AverageOfConsecutiveNumbers {

	public static void main(String[] args) {
		int arr[] = { 4, 10, 15, 5, 6,20};

		int i;
		double sum = 0;

		for (i = 0; i + 1 < arr.length; i++) {
			//Adding Two Consecutive Numbers
			sum = arr[i] + arr[i + 1];
			System.out.println(sum / 2 + " ");
		}

	}

}
