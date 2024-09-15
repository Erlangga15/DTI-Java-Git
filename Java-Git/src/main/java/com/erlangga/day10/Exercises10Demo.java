package com.erlangga.day10;

import java.util.Scanner;
import java.util.List;
import com.erlangga.day10.Book.Category;

public class Exercises10Demo {
    private static Scanner scanner = new Scanner(System.in);
    private static LibrarySystem librarySystem = new LibrarySystem();

    public static void runExercises() {
			librarySystem.initializeLibrary();
			try {
					while (true) {
							System.out.println("\nLibrary System:");
							System.out.println("1. Create a new Material");
							System.out.println("2. List all Materials");
							System.out.println("3. Borrow a Material");
							System.out.println("4. Return a Material");
							System.out.println("5. Check Material Status");
							System.out.println("6. Add a new User");
							System.out.println("7. Display User's Borrowed Materials");
							System.out.println("8. Exit");
							System.out.print("Enter your choice: ");
							int choice = scanner.nextInt();
							scanner.nextLine();

							switch (choice) {
									case 1:
											createMaterial();
											break;
									case 2:
											listAllMaterials();
											break;
									case 3:
											borrowMaterial();
											break;
									case 4:
											returnMaterial();
											break;
									case 5:
											checkMaterialStatus();
											break;
									case 6:
											addNewUser();
											break;
									case 7:
											displayUserBorrowedMaterials();
											break;
									case 8:
											System.out.println("Thank you for using the library system. Goodbye!");
											System.exit(0);
									default:
											System.out.println("Invalid choice. Please try again.");
							}
					}
			} catch (Exception e) {
					System.out.println("An error occurred: " + e.getMessage());
			}
    }

    private static void createMaterial() {
        System.out.println("==Create a new Material==");
        System.out.print("Enter material type (1 for Book, 2 for Magazine): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter available count: ");
        int availableCount = scanner.nextInt();
        scanner.nextLine();

        Material material;
        if (type == 1) {
						String bookId = "Book-" + (librarySystem.getAllMaterials().size() + 1);
            System.out.print("Enter category (1 for BUSINESS, 2 for SCIENCE, 3 for TECHNOLOGY, 4 for ENGINEERING, 5 for MATHEMATICS): ");
            int categoryChoice = scanner.nextInt();
            scanner.nextLine();
						Category category = Category.values()[categoryChoice - 1];
            System.out.print("Enter publisher: ");
            String publisher = scanner.nextLine();
            material = new Book(bookId, title, author, category, availableCount, publisher);
        } else {
						String magazineId = "Magazine-" + (librarySystem.getAllMaterials().size() + 1);
            System.out.print("Enter issue date: ");
            String issueDate = scanner.nextLine();
						System.out.print("Enter year: ");
						int year = scanner.nextInt();
						scanner.nextLine();
            material = new Magazine(magazineId, title, author, availableCount, issueDate, year);
        }

        librarySystem.addMaterial(material);
        System.out.println("Material added successfully.");
    }

    private static void listAllMaterials() {
        System.out.println("==List all Materials==");
        librarySystem.displayAllMaterials();
    }

    private static void borrowMaterial() {
        System.out.println("==Borrow a Material==");
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = librarySystem.findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Enter material title: ");
        String title = scanner.nextLine();
        Material material = librarySystem.findMaterialByTitle(title);

        if (material == null) {
            System.out.println("Material not found.");
            return;
        }

        user.borrowMaterial(material);
    }

    private static void returnMaterial() {
        System.out.println("==Return a Material==");
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = librarySystem.findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Enter material title: ");
        String title = scanner.nextLine();
        Material material = librarySystem.findMaterialByTitle(title);

        if (material == null) {
            System.out.println("Material not found.");
            return;
        }

        user.returnMaterial(material);
    }

    private static void checkMaterialStatus() {
        System.out.println("==Check Material Status==");
        System.out.print("Enter material title: ");
        String title = scanner.nextLine();
        Material material = librarySystem.findMaterialByTitle(title);

        if (material == null) {
            System.out.println("Material not found.");
            return;
        }

        material.displayInfo();
    }

    private static void addNewUser() {
        System.out.println("==Add a new User==");
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String id = scanner.nextLine();

        User user = new User(name, id);
        librarySystem.addUser(user);
        System.out.println("User added successfully.");
    }

    private static void displayUserBorrowedMaterials() {
        System.out.println("==Display User's Borrowed Materials==");
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = librarySystem.findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        user.displayBorrowedMaterials();
    }
}