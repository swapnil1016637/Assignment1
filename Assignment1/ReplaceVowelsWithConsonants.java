package com.yash.practice;

import java.util.Scanner;

public class ReplaceVowelsWithConsonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Any Two String: ");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();

		int i, count = 0, index = 0;
		// Convert String To Array
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		for (char ch : ch1) {
			count++;
		}

		for (i = 0; i < count; i++) {
			char c = s1.charAt(i);

			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				try {
					ch1[i] = s2.charAt(index);
					index++;
				} catch (StringIndexOutOfBoundsException e) {
					ch1[i] = '_';
				}

			}
		}
		String s = new String(ch1);

		System.out.println("After Replacing: " + s);

	}

}
