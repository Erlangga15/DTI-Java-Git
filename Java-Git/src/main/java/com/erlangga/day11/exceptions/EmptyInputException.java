package com.erlangga.day11.exceptions;

public class EmptyInputException extends RuntimeException {
	public EmptyInputException() {
		super("Invalid input. Please enter an integer or 'q' to exit.");
	}
}
