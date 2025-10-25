package com.codegnan.controlstatements;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int original = n;
		int sum = 0;
		
		int count = 0, temp = n;
		while(temp > 0) {
			temp = temp / 10;
			count++;
		}
		temp = n;
		while(temp > 0) {
			int digit = temp % 10;
			int power = 1;
			for (int i = 0; i < count; i++) {
				power *= digit;
			}
			sum += power;
			temp = temp /10;
		}
		if (sum == original)
			System.out.println("Armstrong Number");
		else 
			System.out.println("Not a Armstrong Number");
		
		scanner.close();
	}

}
