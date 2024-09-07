package com.erlangga.day5;

import java.util.Scanner;

public class FizzBuzz {
	private int number;
	private Scanner scanner;

	public FizzBuzz() {
		this.scanner = new Scanner(System.in);
	}

	public void printFizzBuzzSequence() {
		System.out.println("Enter a number: ");
		this.number = scanner.nextInt();
		System.out.println("FizzBuzz Sequence: ");
		for (int i = 1; i <= number; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
		System.out.println("=========================");
	}
}
