package com.erlangga.day3.exercise;

public class SecondSmallestElement {
	private int[] array;

	public SecondSmallestElement(int[] array) {
		this.array = array;
	}

	public int findSecondSmallestElement() {
		if (array == null || array.length < 2) {
			return -1;
		}

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : array) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}

		return secondSmallest;
	}
}
