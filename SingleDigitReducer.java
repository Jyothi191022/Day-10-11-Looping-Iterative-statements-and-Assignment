package com.codegnan.controlstatements;

import java.util.Scanner;

public class SingleDigitReducer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num>=10) { // if number has more than one single digit 
			int digitSum = 0; //variable to store the sum of digits for this round
			while(num>=0) { //extract and sum all digits of the current number
				int lastDigit = num%10;//get the lastDigit
				digitSum += lastDigit; //add it to the running total				num = num/10;
				num =num/10; //remove the last digit
			}
			//after summing all digits, set number's to the new sum.
			//and repeat if it still has more than one digit.
			num = digitSum;
		}
		System.out.println(num);
		scanner.close();

	}

}
