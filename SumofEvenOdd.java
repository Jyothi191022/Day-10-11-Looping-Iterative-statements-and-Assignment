package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumofEvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
		scanner.close();
		
	}
	

}
