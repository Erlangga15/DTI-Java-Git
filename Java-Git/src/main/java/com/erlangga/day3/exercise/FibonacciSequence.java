package com.erlangga.day3.exercise;

import java.util.Arrays;

public class FibonacciSequence {
	private int n;

	public FibonacciSequence(int n) {
		this.n = n;
	}

	public String generateFibonacciSequence() {
        int[] sequence = new int[n];
        if (n >= 1) sequence[0] = 0;
        if (n >= 2) sequence[1] = 1;
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        return Arrays.toString(sequence);
    }
}
