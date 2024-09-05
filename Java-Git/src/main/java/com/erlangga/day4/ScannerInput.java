package com.erlangga.day4;

import java.util.Scanner;

public class ScannerInput {
	private Scanner scanner;
	
	public ScannerInput() {
		this.scanner = new Scanner(System.in);
	}

	public void printScannerInput() {
		System.out.println("Scanner Input");
		while (true) {
			System.out.println("1. Press y to continue, 2. Press n to stop");
			String input = scanner.nextLine().trim().toLowerCase();
			if (input.isEmpty()) {
				System.out.println("Invalid input. Please try again.");
				continue;
			}
			char choose = input.charAt(0);
			if (choose == 'y') {
				System.out.println("Continuing...");
			} else if (choose == 'n') {
				System.out.println("Program stopped.");
				break;
			} else {
				System.out.println("Invalid input. Please try again.");
			}
		}
	}
}
