package com.yash.practice;

import java.util.Scanner;

public class SmallToCapital {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any String :");
		String s = scanner.nextLine();

		int i = 0, count = 0;
		String output = "";
		char ch[] = s.toCharArray();
		for (char c : ch) {
			count++;
		}
		for (i = 0; i < count; i++) {
			char ch1 = s.charAt(i);
			if (ch1 <= 90 && ch1 >= 65) {
				char ch2 = (char) (ch1 + 32);
				output += ch2;

			} else if (ch1 >= 97 && ch1 <= 122) {
				char ch2 = (char) (ch1 - 32);
				output += ch2;

			} else {
				output += ch1;
			}

		}
		System.out.println("Output Result: " + output);

	}
}
