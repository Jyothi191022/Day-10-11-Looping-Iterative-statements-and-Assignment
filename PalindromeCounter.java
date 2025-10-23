package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int upperLimit = scanner.nextInt();
		int currentNumber = 1; //iterator from 1 to n
		int palindromeCount = 0; //counter to store number of palindromes
		while(currentNumber<=upperLimit) {
			int originalNumber= currentNumber; //keep the original number
			int numberToReverse = originalNumber; // temporary variable for reversing
			int reversedNumber = 0; //store reversed number
			
			while(numberToReverse>0) {
				int lastDigit = numberToReverse%10; //track last digitex
				reversedNumber = reversedNumber * 10 + lastDigit; // append digit
				numberToReverse = numberToReverse / 10; //remove last digit
			}
			//check if the original and reversed numberrs are the same
			if(originalNumber == reversedNumber) {
				palindromeCount++; //increment the count if palindrome
			}
			currentNumber++; //move to the next number
		}
		System.out.println(palindromeCount);
		scanner.close();
	}

}
