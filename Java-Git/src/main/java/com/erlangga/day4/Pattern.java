package com.erlangga.day4;

import java.util.Scanner;

public class Pattern {
	private Scanner scanner;
	int m = 1;

	public Pattern() {
		this.scanner = new Scanner(System.in);
	}

	public void printPattern() {
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();

		System.out.println("Pattern");
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*' + " ");
			}
			System.out.println();
		}
	}
}
