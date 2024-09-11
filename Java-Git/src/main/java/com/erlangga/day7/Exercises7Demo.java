package com.erlangga.day7;

import java.util.Scanner;

public class Exercises7Demo {
	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	public static void runExercises() {
		System.out.println("Exercise 7!!");
		System.out.println("Choose program that you want to run:");
		System.out.println("1. Calculate Average of Array");
		System.out.println("2. File Handling");
		System.out.print("Enter your choice (1-2): ");

		int programChoice = scanner.nextInt();
		System.out.println("=========================");

		switch (programChoice) {
			case 1:
				CalculateAverageOfArray calculateAverageOfArray = new CalculateAverageOfArray(scanner);
				calculateAverageOfArray.printCalculateAverage();
				break;
			case 2:
				FileHandling.readFromFile("D:\\DTI-Bootcamp\\Java-Git\\Java-Git\\src\\main\\resources\\product_sales_data.csv");
				break;
			default:
				System.out.println("Not valid choice.");
		}

		scanner.close();
	}
}
