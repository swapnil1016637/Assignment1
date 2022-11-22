package com.yash.practice;

public class PalindromeString {

	public static boolean checkPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString();
		if (s.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String arr[] = { "ABA", "ABC", "MADAM", "NITIN", "XYZ" };
		int ind = 0;
		String resar[] = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (checkPalindrome(arr[i])) {
				resar[ind] = arr[i];
				ind++;
			}
		}
		System.out.println("before");
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("after");
		for (String s : resar) {
			if (s != null)
				System.out.print(s + " ");
		}
	}

}
