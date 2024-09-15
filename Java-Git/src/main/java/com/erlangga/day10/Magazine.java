package com.erlangga.day10;

public class Magazine extends Material {
	private String issue;
	private int year;

	public Magazine(String id, String title, String author, int availableCount, String issue, int year) {
		super(id, title, author, availableCount, false);
		this.issue = issue;
		this.year = year;
	}

	@Override
	public void displayInfo() {
		System.out.println("Magazine Details:");
		System.out.println("ID: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Available Count: " + getAvailableCount());
		System.out.println("Is Borrowed: " + isBorrowed());
		System.out.println("Issue: " + issue);
		System.out.println("Year: " + year);
	}
}
