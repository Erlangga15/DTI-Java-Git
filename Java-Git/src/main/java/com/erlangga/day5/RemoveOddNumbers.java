package com.erlangga.day5;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveOddNumbers {
	private Scanner scanner;

	public RemoveOddNumbers() {
		this.scanner = new Scanner(System.in);
	}

	public void removeOddNumbers() {
		System.out.println("Remove Odd Numbers");
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int[] numbers = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}

		int[] evenNumbers = removeOddNumbers(numbers);
		System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
		System.out.println("=========================");
	}

	public int[] removeOddNumbers(int[] numbers) {
		return Arrays.stream(numbers).filter(number -> number % 2 == 0).toArray();
	}
}
