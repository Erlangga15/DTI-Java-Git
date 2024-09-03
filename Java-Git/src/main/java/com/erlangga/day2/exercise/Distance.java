package com.erlangga.day2.exercise;

public class Distance {
	private double centimeter;

	public Distance(double centimeter) {
		this.centimeter = centimeter;
	}

	public double getKilometer() {
		return centimeter / 100000;
	}

	public String getKilometerString() {
		return String.format("%.2f km", getKilometer());
	}
}
