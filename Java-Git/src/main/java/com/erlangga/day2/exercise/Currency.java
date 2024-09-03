package com.erlangga.day2.exercise;

public class Currency {
	private double number;

	public Currency(double number) {
		this.number = number;
	}

	public String getIndonesianRupiah() {
		return "Rp. " + String.format("%,.2f", number);
	}
}
