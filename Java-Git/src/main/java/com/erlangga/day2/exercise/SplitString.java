package com.erlangga.day2.exercise;

public class SplitString {
	private String word;
	private String delimiter;

	public SplitString(String word, String delimiter) {
		this.word = word;
		this.delimiter = delimiter;
	}

	public String splitString() {
		return word.replace(delimiter, "");
	}
}
