package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your pin:");
		int pin = scanner.nextInt();
		int count = 0;
		int temp = pin;
		if (pin == 0) {
			count = 1;
		} else {
			while (temp != 0) {
				temp = temp / 10;
				count++;
			}
		}
		System.out.println("Number of digits:" +count);
		scanner.close();

	}

}
