package com.erlangga.day2.exercise;

public class Palindrome {
	private String word;

	public Palindrome(String word) {
		this.word = word;
	}

	public boolean isPalindrome() {
		return word.equals(new StringBuilder(word).reverse().toString());
	}
}
