package com.erlangga.day6;

import java.util.Scanner;
import java.util.Arrays;

public class SortArrayAscendingOrDescending {
    private final Scanner scanner;

    public SortArrayAscendingOrDescending(Scanner scanner) {
        this.scanner = scanner;
    }

	private int[] inputArray() {	
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	private String inputSortingOrder() {
		System.out.println("Enter the sorting order (ascending/descending): ");
		return scanner.next().toLowerCase();
	}

	public void printSortedArray() {
		int[] array = inputArray();
		String sortingOrder = inputSortingOrder();
		
		if ("ascending".equals(sortingOrder) || "asc".equals(sortingOrder)) {
			bubbleSort(array, true);
			System.out.println("Array sorted in ascending order: " + Arrays.toString(array));
		} else if ("descending".equals(sortingOrder) || "desc".equals(sortingOrder)) {
			bubbleSort(array, false);
			System.out.println("Array sorted in descending order: " + Arrays.toString(array));
		} else {
			System.out.println("Invalid sorting order.");
		}
	}

	private void bubbleSort(int[] array, boolean ascending) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (ascending ? array[j] > array[j + 1] : array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
