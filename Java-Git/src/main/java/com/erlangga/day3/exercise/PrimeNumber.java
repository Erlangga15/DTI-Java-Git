package com.erlangga.day3.exercise;

public class PrimeNumber {
	private int number;

	public PrimeNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		return number > 1 && number % 2 != 0;
	}
}
