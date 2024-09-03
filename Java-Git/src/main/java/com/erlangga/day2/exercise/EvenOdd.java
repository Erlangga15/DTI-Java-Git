package com.erlangga.day2.exercise;

public class EvenOdd {
	private int number;

	public EvenOdd(int number) {
		this.number = number;
	}

	public boolean isEven() {
		return number % 2 == 0;
	}

}
