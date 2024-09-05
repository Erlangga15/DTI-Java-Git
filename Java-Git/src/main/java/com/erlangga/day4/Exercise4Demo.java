package com.erlangga.day4;

public class Exercise4Demo {
	public static void runExercises() {
		System.out.println("Exercise 4!!");

		//Program print a multiplication table up to n x n
		MultiplicationTable multiplicationTable = new MultiplicationTable();
		multiplicationTable.printMultiplicationTable();
		System.out.println("================================================");

		//Program print following pattern for n number of rows
		Pattern pattern = new Pattern();
		pattern.printPattern();
		System.out.println("================================================");

		//Program that reads n number of input from scanner
		ScannerInput scannerInput = new ScannerInput();
		scannerInput.printScannerInput();
		System.out.println("================================================");
		//Program to guessing a random number and the user has to guess the number
		GuessNumber guessNumber = new GuessNumber(100);
		guessNumber.play();
		System.out.println("================================================");

		//Program to swap each character of a string
		SwapString swapString = new SwapString("The QuiCk BrOwN Fox");
		swapString.printSwapString();
		System.out.println("================================================");
	}
}
