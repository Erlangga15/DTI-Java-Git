package com.erlangga.day4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int rangeRandomNumber;
	private Random random;
	private Scanner scanner;
	private int targetNumber;

	public GuessNumber(int rangeRandomNumber) {
		this.rangeRandomNumber = rangeRandomNumber;
		this.random = new Random();
		this.scanner = new Scanner(System.in);
		this.targetNumber = generateRandomNumber();
	}

	private int generateRandomNumber() {
		return random.nextInt(rangeRandomNumber) + 1;
	}

	public void play() {
		System.out.println("Guess the number between 1 and " + rangeRandomNumber + ":");
		while (true) {
			int guess = getValidGuess();
			if (checkGuess(guess)) {
				break;
			}
		}
		System.out.println("Congratulations! You guessed the number " + targetNumber);
	}

	private int getValidGuess() {
		while (true) {
			System.out.print("Enter your guess: ");
			if (scanner.hasNextInt()) {
				int guess = scanner.nextInt();
				if (guess > 0 && guess <= rangeRandomNumber) {
					return guess;
				}
			}
			System.out.println("Invalid input. Please enter a number between 1 and " + rangeRandomNumber);
			scanner.nextLine();
		}
	}

	private boolean checkGuess(int guess) {
		if (guess > targetNumber) {
			System.out.println("Too high");
		} else if (guess < targetNumber) {
			System.out.println("Too low");
		} else {
			return true;
		}
		return false;
	}
}
