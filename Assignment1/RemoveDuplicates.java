package com.yash.practice;

public class RemoveDuplicates {
	public static int removeDuplicateNumbers(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int i, j = 0;// for next element
		for (i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
	}

	// WAP to remove duplicate numbers from list of numbers.
	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int count = 0;
		for (int i : arr) {
			count++;
		}
		int length = count;
		length = removeDuplicateNumbers(arr, length);
		// printing array elements

		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}
