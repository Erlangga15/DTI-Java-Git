package com.erlangga.exercise;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        calculateArea();
    }

    public static void calculateArea() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double area = length * width;
            System.out.printf("The area of the rectangle is: %.2f\n", area);
        }
    }
}
