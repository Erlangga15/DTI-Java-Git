package com.erlangga.day6;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class FindAllDuplicateOnArray {
	private final Scanner scanner;

	public FindAllDuplicateOnArray(Scanner scanner) {
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

	public ArrayList<Integer> findAllDuplicateElement() {
		int[] array = inputArray();
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();

		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			if (map.get(num) == 2) {
				result.add(num);
			}
		}
		return result;
	}

	public void printFindAllDuplicate() {
		ArrayList<Integer> duplicates = findAllDuplicateElement();
		if (duplicates.isEmpty()) {
			System.out.println("There is no duplicate element in the array.");
		} else {
			System.out.println("The duplicate element in the array is: " + duplicates);
		}
	}
}
