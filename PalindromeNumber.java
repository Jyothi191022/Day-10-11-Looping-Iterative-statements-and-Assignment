package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = scanner.nextInt();
		int original = n;
		int reversed = 0;
		while (n > 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n = n / 10;
		}
		if (original == reversed) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
