package com.erlangga.day10;

import java.util.ArrayList;
import java.util.List;
import com.erlangga.day10.Book.Category;

public class LibrarySystem {
    private List<Material> materials;
    private List<User> users;

    public LibrarySystem() {
        this.materials = new ArrayList<>();
        this.users = new ArrayList<>();
    }

		public void initializeLibrary() {
			Book book1 = new Book("Book-1", "Harry Potter", "J.K. Rowling", Category.FICTION, 10, "Bloomsbury");
			Book book2 = new Book("Book-2", "The Lean Startup", "Eric Ries", Category.BUSINESS, 5, "Crown Business");
			Book book3 = new Book("Book-3", "Clean Code", "Robert C. Martin", Category.TECHNOLOGY, 3, "Prentice Hall");

			Magazine magazine1 = new Magazine("Magazine-4", "National Geographic", "Various", 2, "January 2024", 2024);
			Magazine magazine2 = new Magazine("Magazine-5", "Time", "Various", 1, "February 2024", 2024);

			materials.add(book1);
			materials.add(book2);
			materials.add(book3);
			materials.add(magazine1);
			materials.add(magazine2);
		}

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<Material> getAllMaterials() {
        return materials;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public Material findMaterialByTitle(String title) {
        for (Material material : materials) {
            if (material.getTitle().equalsIgnoreCase(title)) {
                return material;
            }
        }
        return null;
    }

    public User findUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public void displayAllMaterials() {
        System.out.println("All materials in the library:");
        for (Material material : materials) {
            material.displayInfo();
            System.out.println();
        }
    }
}