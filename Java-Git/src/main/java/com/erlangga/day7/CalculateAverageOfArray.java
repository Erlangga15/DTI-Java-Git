package com.erlangga.day7;

import java.util.Scanner;
import java.util.ArrayList;
import com.erlangga.day7.exceptions.AvarageInvalidInputExeception;

public class CalculateAverageOfArray {
	private Scanner scanner;

	public CalculateAverageOfArray(Scanner scanner) {
		this.scanner = scanner;
	}

	public int[] inputArray() {
		System.out.println("Enter positive numbers to calculate the average (press 'q' to finish):");
		ArrayList<Integer> numbers = new ArrayList<>();
		scanner.nextLine();
		
		while (true) {
			String input = scanner.nextLine().trim();
			
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			
			try {
				int number = Integer.parseInt(input);
				if (number <= 0) {
					throw new AvarageInvalidInputExeception();
				}
				numbers.add(number);
			} catch (NumberFormatException e) {
				throw new AvarageInvalidInputExeception();
			}
		}
		
		if (numbers.isEmpty()) {
			throw new AvarageInvalidInputExeception();
		}
		
		return numbers.stream().mapToInt(Integer::intValue).toArray();
	}

	public double calculateAverage(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return (double) sum / array.length;
	}

	public void printCalculateAverage() {
		try {
			int[] array = inputArray();
			double average = calculateAverage(array);
			System.out.println("The average of the array is: " + average);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
