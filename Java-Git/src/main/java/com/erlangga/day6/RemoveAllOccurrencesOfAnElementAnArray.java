package com.erlangga.day6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllOccurrencesOfAnElementAnArray {
	private final Scanner scanner;

	public RemoveAllOccurrencesOfAnElementAnArray(Scanner scanner) {
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

	public int inputElement() {
		System.out.print("Enter the element to remove: ");
		int element = scanner.nextInt();
		return element;
	}	

	public int[] removeAllOccurrences() {
		int[] array = inputArray();
		int element = inputElement();
		ArrayList<Integer> result = new ArrayList<>();
		for (int num : array) {
			if (num != element) {
				result.add(num);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public void printRemoveAllOccurrences() {
		int[] result = removeAllOccurrences();
		System.out.println("The array after removing all occurrences: " + Arrays.toString(result));
	}
}
