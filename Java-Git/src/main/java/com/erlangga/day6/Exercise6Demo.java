package com.erlangga.day6;

import java.util.Scanner;

public class Exercise6Demo {
	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	public static void runExercises() {
		System.out.println("Exercise 6!!");
		System.out.println("Choose program that you want to run:");
		System.out.println("1. Rotate Array");
		System.out.println("2. Check Array Contains Duplicate");
		System.out.println("3. Remove Duplicate From Array");
		System.out.println("4. Sort Array Ascending or Descending");
		System.out.println("5. Remove All Occurrences of an Element an Array");
		System.out.println("6. Reverse String Without Using Built-in Method");
		System.out.println("7. Find All Duplicate on Array");
		System.out.println("8. Number of Days Have to Wait After the i-th Day to get a Warmer Temperature");
		System.out.print("Enter your choice (1-8): ");
	
		int programChoice = scanner.nextInt();
		System.out.println("=========================");

		switch (programChoice) {
			case 1:
				RotateArray rotateArray = new RotateArray(scanner);
				rotateArray.printRotateArray();
				break;
			case 2:
				CheckArrayContainsDuplicate checkArrayContainsDuplicate = new CheckArrayContainsDuplicate(scanner);
				checkArrayContainsDuplicate.printCheckArrayDuplicate();
				break;
			case 3:
				RemoveDuplicateFromArray removeDuplicateFromArray = new RemoveDuplicateFromArray(scanner);
				removeDuplicateFromArray.printRemoveDuplicate();
				break;
			case 4:
				SortArrayAscendingOrDescending sortArrayAscendingOrDescending = new SortArrayAscendingOrDescending(scanner);
				sortArrayAscendingOrDescending.printSortedArray();
				break;
			case 5:
				RemoveAllOccurrencesOfAnElementAnArray removeAllOccurrencesOfAnElementAnArray = new RemoveAllOccurrencesOfAnElementAnArray(scanner);
				removeAllOccurrencesOfAnElementAnArray.printRemoveAllOccurrences();
				break;
			case 6:
				ReverseStringWithoutUsingBuiltInMethod reverseStringWithoutUsingBuiltInMethod = new ReverseStringWithoutUsingBuiltInMethod(scanner);
				reverseStringWithoutUsingBuiltInMethod.printReverseString();
				break;
			case 7:
				FindAllDuplicateOnArray findAllDuplicateOnArray = new FindAllDuplicateOnArray(scanner);
				findAllDuplicateOnArray.printFindAllDuplicate();
				break;
			case 8:
				WarmerTemperatureDays warmerTemperatureDays = new WarmerTemperatureDays(scanner);
				warmerTemperatureDays.printWarmerTemperatureDays();
				break;
			default:
				System.out.println("Not valid choice.");
		}

		scanner.close();
	}
}
