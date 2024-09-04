package com.erlangga.day3.exercise;

public class CountVowels {
	private String text;

	public CountVowels(String text) {
		this.text = text;
	}

	public int countVowels() {
		int count = 0;
		for (char c : text.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		return count;
	}
}
