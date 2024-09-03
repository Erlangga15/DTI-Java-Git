package com.erlangga.exercise;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Run rectangle task
        System.out.println("1. Running Rectangle Task");
        Rectangle.main(args);
        System.out.println();

        // Run circle task
        System.out.println("2. Running Circle Task");
        Circle.main(args);
        System.out.println();

        // Run triangle task
        System.out.println("3. Running Triangle Task");
        Triangle.main(args);
        System.out.println();  

        // Run datesinDays task
        System.out.println("4. Running DatesinDays Task");
        DatesinDays.main(args);
        System.out.println();

        // Run initalName task
        System.out.println("5. Running InitalName Task");
        InitalName.main(args);
        System.out.println();
    }
}