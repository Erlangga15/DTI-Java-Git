package com.erlangga.day3.exercise;

public class Anagram {
	private String text1;
	private String text2;

	public Anagram(String text1, String text2) {
		this.text1 = text1;
		this.text2 = text2;
	}

	public boolean isAnagram() {
		if (text1.length() != text2.length()) {
			return false;
		}

		char[] chars1 = text1.toLowerCase().toCharArray();
		char[] chars2 = text2.toLowerCase().toCharArray();

		int[] charCount = new int[26];

		for (int i = 0; i < chars1.length; i++) {
			charCount[chars1[i] - 'a']++;
			charCount[chars2[i] - 'a']--;
		}

		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}
}
