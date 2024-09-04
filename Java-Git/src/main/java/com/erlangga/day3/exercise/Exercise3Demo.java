package com.erlangga.day3.exercise;

import java.util.Scanner;

public class Exercise3Demo {
	public static void runExercises() {
		System.out.println("Exercise 3!!");

		//Calculate the sum of the digits of a number
		SumOfDigits sumOfDigits = new SumOfDigits(12345);
		System.out.println("Sum of the digits of a number: " + sumOfDigits.sumOfDigits());

		//Check if a number is prime
		PrimeNumber primeNumber = new PrimeNumber(17);
		System.out.println("Number is prime: " + primeNumber.isPrime());

		//Find largest element in an array
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		LargestElement largestElement = new LargestElement(array);
		System.out.println("Largest element in an array: " + largestElement.findLargestElement());

		// Simple calculator
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter operation: ");
		String operation = scanner.nextLine();
		SimpleCalculator simpleCalculator = new SimpleCalculator(operation);
		System.out.println("Result: " + simpleCalculator.calculate());

		//Fibonacci sequence
		FibonacciSequence fibonacciSequence = new FibonacciSequence(6);
		System.out.println("Fibonacci sequence: " + fibonacciSequence.generateFibonacciSequence());

		//Count vowels in a string
		CountVowels countVowels = new CountVowels("Hello World");
		System.out.println("Count vowels in a string: " + countVowels.countVowels());

		//Sort an array using bubble sort
		int[] array2 = {5, 3, 8, 4, 2};
		BubbleSort bubbleSort = new BubbleSort(array2);
		System.out.println("Sort an array using bubble sort: " + bubbleSort.sort());

		//Check if two strings are anagrams
		Anagram anagram = new Anagram("listen", "silent");
		System.out.println("Two strings are anagrams: " + anagram.isAnagram());

		//Find second smallest element in an array
		int[] array3 = {5, 3, 8, 4, 2};
		SecondSmallestElement secondSmallestElement = new SecondSmallestElement(array3);
		System.out.println("Second smallest element in an array: " + secondSmallestElement.findSecondSmallestElement());
	}
}
