package com.erlangga.day2.exercise;

import java.util.Scanner;

public class Exercise2Demo {
	public static void runExercises() {
		System.out.println("Exercise 2!!");

		//Convert Fahrenheit to Celsius
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		Temperature temperature = new Temperature(fahrenheit);
		System.out.println("Temperature in Celsius: " + temperature.getCelsiusString());

		//Convert Centimeter to Kilometer
		Distance distance = new Distance(100000);
		System.out.println("Distance in Kilometer: " + distance.getKilometerString());

		//Check if number is even or odd
		EvenOdd evenOdd = new EvenOdd(1000);
		System.out.println("Number is even: " + evenOdd.isEven());

		//Remove specific character from string
		SplitString splitString = new SplitString("Hello World", "ell");
		System.out.println("String after remove specific character: " + splitString.splitString());

		//Check if string is palindrome
		Palindrome palindrome = new Palindrome("Madam");
		System.out.println("String is palindrome: " + palindrome.isPalindrome());

		//Convert number to Indonesian Rupiah
		Currency currency = new Currency(100000);
		System.out.println("Currency in Indonesian Rupiah: " + currency.getIndonesianRupiah());
	}
}
