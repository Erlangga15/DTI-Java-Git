package com.erlangga.day6;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArray {
	private final Scanner scanner;

	public RemoveDuplicateFromArray(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public int[] inputArray() {
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public int[] removeDuplicateFromArray() {
		int[] array = inputArray();
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();

		for (int num : array) {
			if (!map.containsKey(num)) {
				map.put(num, true);
				result.add(num);
			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public void printRemoveDuplicate() {
		System.out.println("The array after removing duplicate: " + Arrays.toString(removeDuplicateFromArray()));
	}
	
}
