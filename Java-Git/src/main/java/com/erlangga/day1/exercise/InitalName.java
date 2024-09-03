package com.erlangga.day1.exercise;

import java.util.Scanner;

public class InitalName {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			getInitialName(name);
		}
	}

	public static void getInitialName(String name) {
		String[] nameParts = name.split(" ");
		if (nameParts.length >= 2) {
			String initialName = String.valueOf(nameParts[0].charAt(0)) + String.valueOf(nameParts[1].charAt(0));
			System.out.println("The initial name is: " + initialName);
		} else {
			System.out.println("Please enter at least two names.");
		}
	}
}
