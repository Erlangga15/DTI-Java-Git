package com.erlangga.day1.exercise;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatesinDays {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the date 1 (year, month, day): ");
			int year1 = scanner.nextInt();
			int month1 = scanner.nextInt();
			int day1 = scanner.nextInt();
			System.out.println("Enter the date 2 (year, month, day): ");
			int year2 = scanner.nextInt();
			int month2 = scanner.nextInt();
			int day2 = scanner.nextInt();
			calculateDifferenceInDays(year1, month1, day1, year2, month2, day2);
		}
	}

	public static void calculateDifferenceInDays(int year1, int month1, int day1, int year2, int month2, int day2) {
		LocalDate date1 = LocalDate.of(year1, month1, day1);
		LocalDate date2 = LocalDate.of(year2, month2, day2);
		long differenceInDays = ChronoUnit.DAYS.between(date1, date2);
		System.out.println("The difference in days between " + date1 + " and " + date2 + " is: " + differenceInDays);
	}
}
