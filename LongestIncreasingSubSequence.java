package com.codegnan.controlstatements;

import java.util.Scanner;

public class LongestIncreasingSubSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] prices = new int[n];
        for(int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        
        int maxLength = 1;
        int currentLength = 1;
        
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }
        
        System.out.println(maxLength);
    }
}