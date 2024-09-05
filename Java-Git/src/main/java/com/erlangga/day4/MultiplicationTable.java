package com.erlangga.day4;

import java.util.Scanner;

public class MultiplicationTable {
	private Scanner scanner;

	public MultiplicationTable() {
		this.scanner = new Scanner(System.in);
	}

	public void printMultiplicationTable() {
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("Multiplication Table");
		for (int i = 1; i <= number; i++) {
			System.out.print("|");
			for (int j = 1; j <= number; j++) {
				if (i * j < 10) {
					System.out.print(" " + i * j + "  ");
				} else if (i * j < 100) {
					System.out.print(" " + i * j + " ");
				} else {
					System.out.print(i * j + " ");
				}
			}
			System.out.println("|");
		}
	}
}
