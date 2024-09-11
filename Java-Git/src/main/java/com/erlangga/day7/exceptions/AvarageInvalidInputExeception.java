package com.erlangga.day7.exceptions;

public class AvarageInvalidInputExeception extends RuntimeException {
	public AvarageInvalidInputExeception() {
		super("Invalid input. Please enter a valid number or 'q' to finish.");
	}
}
