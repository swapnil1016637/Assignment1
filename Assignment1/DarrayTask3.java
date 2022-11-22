package com.yash.practice;

import java.util.Scanner;

public class DarrayTask3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter aray size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		int ind = 0;
		System.out.println("enter the array values");
		for (int i = 0; i <= size; i++) {
			try {
				System.out.println("enter value");
				arr[i] = sc.nextInt();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(
						"you are trying to add data out of your enterd size range if you want add more data press 1");
				int val2 = sc.nextInt();
				if (val2 == 1) {
					int ar[] = arr;
					arr = new int[size + 3];

					for (int val : ar) {
						arr[ind] = val;
						ind++;
					}
					for (int j = i; j < arr.length; j++) {
						System.out.println("enter array value");
						arr[j] = sc.nextInt();
					}
				} else {
					System.out.println("invalid input");
				}
				break;
			}

		}
		for (int val : arr) {
			System.out.println(val);
		}

	}
}
