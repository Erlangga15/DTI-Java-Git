package com.erlangga.day1.exercise;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the radius of the circle: ");
			int radius = scanner.nextInt();
			calculateDiameter(radius);
			calculateCircumference(radius);
			calculateArea(radius);
		}
	}

	public static void calculateDiameter(int radius) {
		int diameter = 2 * radius;
		System.out.println("The diameter of the circle is: " + diameter);
	}

	public static void calculateCircumference(int radius) {
		double circumference = 2 * Math.PI * radius;
		System.out.println("The circumference of the circle is: " + circumference);
	}

	public static void calculateArea(int radius) {
		double area = Math.PI * radius * radius;
		System.out.println("The area of the circle is: " + area);
	}
}
