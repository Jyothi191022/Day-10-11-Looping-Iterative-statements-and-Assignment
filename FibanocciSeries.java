package com.codegnan.controlstatements;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = 0, b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
		scanner.close();
	}

}
