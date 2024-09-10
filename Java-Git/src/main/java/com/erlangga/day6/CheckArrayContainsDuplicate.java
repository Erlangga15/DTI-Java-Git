package com.erlangga.day6;

import java.util.Scanner;

public class CheckArrayContainsDuplicate {
    private final Scanner scanner;

    public CheckArrayContainsDuplicate(Scanner scanner) {
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

    private boolean checkArrayContainsDuplicate() {
        int[] inputArray = inputArray();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }

	public void printCheckArrayDuplicate() {
			System.out.println("The array contains duplicate: " + checkArrayContainsDuplicate());
	}
}
