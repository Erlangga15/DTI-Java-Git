package com.erlangga.day10;

public class Book extends Material {
	private String publisher;
	private Category category;

	public enum Category {
		SCIENCE,
		TECHNOLOGY,
		POLITICS,
		BUSINESS,
		FICTION,
	}

	public Book(String id, String title, String author, Category category, int availableCount, String publisher) {
		super(id, title, author, availableCount, false);
		this.category = category;
		this.publisher = publisher;
	}

	@Override
	public void displayInfo() {
		System.out.println("Book Details:");
		System.out.println("ID: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Category: " + category);
		System.out.println("Publisher: " + publisher);
		System.out.println("Available Count: " + getAvailableCount());
		System.out.println("Is Borrowed: " + isBorrowed());
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
