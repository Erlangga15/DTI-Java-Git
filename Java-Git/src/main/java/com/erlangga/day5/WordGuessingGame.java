package com.erlangga.day5;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
	private Scanner scanner;
	private String word;
	private String hiddenWord;
	private int maxAttempts;
	private int attempts;

	public WordGuessingGame() {
		this.scanner = new Scanner(System.in);
		this.maxAttempts = 5;
		this.attempts = 0;
	}

	public void play() {
		System.out.println("Word Guessing Game");
		this.word = selectRandomWord();
		this.hiddenWord = hideWord(this.word);

		while (attempts < maxAttempts && !isGameWon()) {
			displayGameStatus(word, hiddenWord, maxAttempts - attempts);
			char guess = getPlayerGuess();
			if (isGuessCorrect(word, guess)) {
				hiddenWord = updateHiddenWord(hiddenWord, guess);
			} else {
				attempts++;
			}
		}

		if (isGameWon()) {
			System.out.println("Congratulations! You guessed the word: " + word);
		} else {
			System.out.println("Game over! The word was: " + word);
		}
		System.out.println("=========================");
	}
	

	private String selectRandomWord() {
		String[] words = {"hello", "world", "java", "python", "javascript"};
		Random random = new Random();
		return words[random.nextInt(words.length)];
	}

	private String hideWord(String word) {
		StringBuilder hiddenWord = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			hiddenWord.append("_");
		}
		return hiddenWord.toString();
	}

	private char getPlayerGuess() {
		System.out.println("Enter a letter: ");
		return scanner.next().charAt(0);
	}

	private boolean isGuessCorrect(String word, char guess) {
		return word.indexOf(guess) != -1;
	}

	private String updateHiddenWord(String hiddenWord, char guess) {
		StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess) {
				updatedHiddenWord.setCharAt(i, guess);
			}
		}
		return updatedHiddenWord.toString();
	}

	private void displayGameStatus(String wordToGuess, String hiddenWord, int attemptsLeft) {
		System.out.println("Word: " + hiddenWord);
		System.out.println("Attempts Left: " + attemptsLeft);
	}

	private boolean isGameWon() {
		return word.equals(hiddenWord);
	}
}
