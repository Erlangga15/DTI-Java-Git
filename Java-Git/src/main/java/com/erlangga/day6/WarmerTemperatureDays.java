package com.erlangga.day6;

import java.util.Scanner;
import java.util.Arrays;

public class WarmerTemperatureDays {
	private final Scanner scanner;

	public WarmerTemperatureDays(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public int[] inputTemperature() {
		System.out.print("Enter the number of temperature: ");
		int size = scanner.nextInt();
		int[] temperature = new int[size];
		System.out.println("Enter the temperature for each day: ");
		for (int i = 0; i < size; i++) {
			temperature[i] = scanner.nextInt();
		}
		return temperature;
	}

	public int[] warmerTemperatureDays() {
		int[] temperature = inputTemperature();
		int[] result = new int[temperature.length];
		for (int i = 0; i < temperature.length; i++) {
			for (int j = i + 1; j < temperature.length; j++) {
				if (temperature[i] < temperature[j]) {
					result[i] = j - i;
					break;
				}
			}
		}
		return result;
	}

	public void printWarmerTemperatureDays() {
		int[] result = warmerTemperatureDays();
		System.out.println(Arrays.toString(result));
	}
}

