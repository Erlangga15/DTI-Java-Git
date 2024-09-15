package com.erlangga.day10;

public abstract class Material {
	protected String id;
	protected String title;
	protected String author;
	protected int availableCount;
	protected boolean isBorrowed;

	public Material(String id, String title, String author, int availableCount, boolean isBorrowed) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.availableCount = availableCount;
		this.isBorrowed = false;
	}

	public abstract void displayInfo();
	
	public boolean borrow() {
		if (availableCount > 0 && !isBorrowed) {
			availableCount--; 
			isBorrowed = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean returnMaterial() {
		if (isBorrowed) {
			isBorrowed = false;
			availableCount++;
			return true;
		} else {
			return false;
		}
	}

	// Getter and Setter
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getAvailableCount() {
		return availableCount;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}
}

