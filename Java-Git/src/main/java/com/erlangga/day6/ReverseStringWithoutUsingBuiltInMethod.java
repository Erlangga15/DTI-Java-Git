package com.erlangga.day6;

import java.util.Scanner;

public class ReverseStringWithoutUsingBuiltInMethod {
	private final Scanner scanner;

	public ReverseStringWithoutUsingBuiltInMethod(Scanner scanner) {
		this.scanner = scanner;
	}

	public String inputString() {
		System.out.print("Enter a string: ");
		scanner.nextLine();
		return scanner.nextLine();
	}

	public String reverseString(String input) {
		char[] charArray = input.toCharArray();
		int start = 0;
		int end = charArray.length - 1;
		while (start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		return new String(charArray);
	}

	public void printReverseString() {
		String input = inputString();
		String reversed = reverseString(input);
		System.out.println("The reversed string is: " + reversed);
	}
}

