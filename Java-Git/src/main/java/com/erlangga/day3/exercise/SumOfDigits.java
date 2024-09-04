package com.erlangga.day3.exercise;

public class SumOfDigits {
	private int number;

	public SumOfDigits(int number) {
		this.number = number;
	}

	public int sumOfDigits() {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}