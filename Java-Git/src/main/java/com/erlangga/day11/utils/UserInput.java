package com.erlangga.day11.utils;

import com.erlangga.day11.exceptions.EmptyInputException;
import java.util.Scanner;

public class UserInput {
	static Scanner scanner = new Scanner(System.in);

	// for string input
	public static String inputString(String prompt) {
		System.out.println(prompt);
		String inputtedString;

		try {
			inputtedString = scanner.nextLine();
		} catch (EmptyInputException e) {
			throw new EmptyInputException();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return inputtedString;
	}

	// for integer input
	public static int inputInteger(String prompt) {
		System.out.println(prompt);
		int inputtedInteger;

		try {
			inputtedInteger = scanner.nextInt();
			scanner.nextLine();
		} catch (EmptyInputException e) {
			throw new EmptyInputException();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return inputtedInteger;
	}

	// for double input
	public static double inputDouble(String prompt) {
		System.out.println(prompt);
		double inputtedDouble;

		try {
			inputtedDouble = scanner.nextDouble();
		} catch (EmptyInputException e) {
			throw new EmptyInputException();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return inputtedDouble;
	}

	public static int quitMenu(String prompt){
		try {
			while (true) {
				System.out.println(prompt);
				char a = scanner.nextLine().charAt(0);

				if (a == 'q'){
					return 0;
				} else{
					System.out.println("Invalid input ! ");
				}
			}
		} catch (EmptyInputException e) {
			throw new EmptyInputException();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
