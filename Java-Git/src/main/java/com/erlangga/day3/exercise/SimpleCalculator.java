package com.erlangga.day3.exercise;

public class SimpleCalculator {
	private String operation;

	public SimpleCalculator(String operation) {
		this.operation = operation;
	}
	
	public int calculate() {
		String[] operationParts = operation.split(" ");
		int result = 0;
		switch (operationParts[1]) {
			case "+":
				result = Integer.parseInt(operationParts[0]) + Integer.parseInt(operationParts[2]);
				break;
			case "-":
				result = Integer.parseInt(operationParts[0]) - Integer.parseInt(operationParts[2]);
				break;
			case "*":
				result = Integer.parseInt(operationParts[0]) * Integer.parseInt(operationParts[2]);
				break;
			case "/":
				result = Integer.parseInt(operationParts[0]) / Integer.parseInt(operationParts[2]);
				break;
			default:
				System.out.println("Invalid operation");
				return 0;
		}
		return result;
	}
	
}
