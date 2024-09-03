package com.erlangga.day1.exercise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan sudut pertama segitiga: ");
            int angleOne = scanner.nextInt();
            System.out.print("Masukkan sudut kedua segitiga: ");
            int angleTwo = scanner.nextInt();
            int angleThree = calculateAngleThree(angleOne, angleTwo);
            System.out.printf("Sudut ketiga segitiga adalah: %d\n", angleThree);
        }
    }

    public static int calculateAngleThree(int angleOne, int angleTwo) {
        return 180 - angleOne - angleTwo;
    }
}