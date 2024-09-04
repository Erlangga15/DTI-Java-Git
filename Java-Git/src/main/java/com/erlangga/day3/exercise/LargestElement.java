package com.erlangga.day3.exercise;

public class LargestElement {
	private int[] array;

	public LargestElement(int[] array) {
		this.array = array;
	}

	public int findLargestElement() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
