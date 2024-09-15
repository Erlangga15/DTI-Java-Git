package com.erlangga.day10;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String id;
	private List<Material> borrowedMaterials;

	public User(String name, String id) {
		this.name = name;
		this.id = id;
		this.borrowedMaterials = new ArrayList<>();
	}

	public void borrowMaterial(Material material) {
		if (material.borrow()) {
			borrowedMaterials.add(material);
			System.out.println(name + " has borrowed " + material.getTitle());
		} else {
			System.out.println(name + " cannot borrow " + material.getTitle() + " because it is not available.");
		}
	}

	public void returnMaterial(Material material) {
		if (material.returnMaterial()) {
			borrowedMaterials.remove(material);
			System.out.println(name + " has returned " + material.getTitle());
		} else {
			System.out.println(name + " cannot return " + material.getTitle() + " because it is not borrowed.");
		}
	}

	public void displayBorrowedMaterials() {
		System.out.println(name + " has borrowed the following materials:");
		for (Material material : borrowedMaterials) {
			material.displayInfo();
			System.out.println();
		}
	}

	public List<Material> getBorrowedMaterials() {
		return borrowedMaterials;
	}

	// Getter and Setter
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
}
