package com.yash.practice;

public class EvenOddTask5 {

	public static boolean checkPrimeNo(int no) {
		int flag = 0;
		for (int i = 2; i <= no / 2; i++) {
			if (no % 2 == 0) {
				flag = 1;
			}
		}
		if (flag == 0) {
			return true;
		}

		else {
			return false;
		}

	}

	public static void main(String[] args) {
		int ar[] = { 4, 7, 12, 10, 18, 19, 14 };
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			// fetching values from array
			int val = ar[i];

			sum += val;
			// checking prime no
			boolean checkprime = checkPrimeNo(val);
			if (checkprime)
				System.out.println("prime no =" + val);
			// even number
			if (val % 2 == 0) {
				System.out.println("even Number=" + val);
			}
			// odd number
			else if (val % 2 != 0) {
				System.out.println("Odd Number=" + val);
			}

		}
		// addition of digit
		System.out.println("addition of array digit=" + sum);
	}
}
