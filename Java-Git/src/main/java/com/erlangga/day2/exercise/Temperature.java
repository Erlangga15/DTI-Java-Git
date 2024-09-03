package com.erlangga.day2.exercise;

public class Temperature {
	private double fahrenheit;

	public Temperature(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public double getCelsius() {
		return (fahrenheit - 32) * 5 / 9;
	}

	public String getCelsiusString() {
		return String.format("%.2f", getCelsius()) + "°C";
	}
}
