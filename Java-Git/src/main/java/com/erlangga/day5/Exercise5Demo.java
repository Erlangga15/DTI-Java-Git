package com.erlangga.day5;

import java.util.Scanner;

public class Exercise5Demo {
	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	public static void runExercises() {
		System.out.println("Exercise 5!!");
		System.out.println("Choose program that you want to run:");
		System.out.println("1. Word Guessing Game");
		System.out.println("2. Currency Converter");
		System.out.println("3. Remove Odd Numbers");
		System.out.println("4. FizzBuzz");
		System.out.println("5. Sum Two Numbers Target Index");
		System.out.print("Enter your choice (1-5): ");
	
		int programChoice = scanner.nextInt();
		System.out.println("=========================");

		switch (programChoice) {
			case 1:
				WordGuessingGame wordGuessingGame = new WordGuessingGame();
				wordGuessingGame.play();
				break;
			case 2:
				CurrencyConverter currencyConverter = new CurrencyConverter();
				currencyConverter.convertCurrency();
				break;
			case 3:
				RemoveOddNumbers removeOddNumbers = new RemoveOddNumbers();
				removeOddNumbers.removeOddNumbers();
				break;
			case 4:
				FizzBuzz fizzBuzz = new FizzBuzz();
				fizzBuzz.printFizzBuzzSequence();
				break;
			case 5:
				SumTwoNumberTargetIndex sumTwoNumberTargetIndex = new SumTwoNumberTargetIndex();
				sumTwoNumberTargetIndex.sumTwoNumberTargetIndex();
				break;
			default:
				System.out.println("Not valid choice.");
		}

		scanner.close();
	}
}
