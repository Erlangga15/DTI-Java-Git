package com.erlangga.day5;

import java.util.Scanner;

public class SumTwoNumberTargetIndex {
	private Scanner scanner;
	private int[] numbers;
	private int target;

	public SumTwoNumberTargetIndex() {
		this.scanner = new Scanner(System.in);
		this.target = 0;
		this.numbers = new int[] { 2, 7, 11, 15, 3, 6, 5 };
	}

	public void sumTwoNumberTargetIndex() {
		System.out.println("Sum Two Number Target Index");
		this.target = getTarget();
		int[] result = getTwoNumberTargetIndex(this.numbers, this.target);
		if (result.length == 2) {
			System.out.println("Result: " + result[0] + " " + result[1]);
		} else {
			System.out.println("No pair exists");
		}
		System.out.println("=========================");
	}

	private int getTarget() {
		System.out.println("Enter the target:");
		return scanner.nextInt();
	}

	private int[] getTwoNumberTargetIndex(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					return new int[] { i, j };
				} else {
					return new int[] {};
				}
			}
		}
		return new int[] {};
	}
}
