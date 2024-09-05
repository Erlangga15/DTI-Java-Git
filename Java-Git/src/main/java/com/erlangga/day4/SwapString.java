package com.erlangga.day4;

public class SwapString {
	private String string;

	public SwapString(String string) {
		this.string = string;
	}

	public void printSwapString() {
		System.out.println("String before swap: " + string);
		String swapString = "";
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			char swapChar = CheckCharacter(c);
			swapString += swapChar;
		}
		System.out.println("String after swap: " + swapString);
	}

	public char CheckCharacter(char c) {
		char swapChar = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
		return swapChar;
	}
}

