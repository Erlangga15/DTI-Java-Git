package com.erlangga.day9;

import java.util.List;
import java.util.Scanner;

import com.erlangga.day9.exceptions.UserNotFoundException;
import com.erlangga.day9.exceptions.InvalidPasswordException;
import com.erlangga.day9.exceptions.TaskNotFoundException;

public class Exercises9Demo {
	private static Scanner scanner = new Scanner(System.in);
	private static ToDoSystem system = new ToDoSystem();
	public static void runExercises() {
		try {
			while (true) {
				if (system.getCurrentUser().isEmpty()) {
					showLoginMenu();
				} else {
					showTaskMenu();
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static void showLoginMenu() {
		System.out.println("\nTo-Do List Application:");
		System.out.println("1. Register User");
		System.out.println("2. Login User");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		scanner.nextLine();

		switch (choice) {
			case 1:
				registerUser();
				break;
			case 2:
				loginUser();
				break;
			case 3:
				System.out.println("Thank you for using the to-do list application. Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
		}
	}

	private static void showTaskMenu() {
		system.getCurrentUser().ifPresent(user -> {
			System.out.println("\nWelcome, " + user.getUsername() + "!");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Delete Task");
			System.out.println("5. Logout");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					addTask();
					break;
				case 2:
					viewTasks();
					break;
				case 3:
					markTaskAsCompleted();
					break;
				case 4:
					deleteTask();
					break;
				case 5:
					logout();
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		});
	}

	private static void registerUser() {
		System.out.println("==Register User==");
		System.out.print("Enter username: ");
		String username = scanner.nextLine();
		System.out.print("Enter password: ");
		String password = scanner.nextLine();
		try {
			system.registerUser(username, password);
		} catch (UserNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidPasswordException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void loginUser() {
		System.out.println("==Login User==");
		System.out.print("Enter username: ");
		String username = scanner.nextLine();
		System.out.print("Enter password: ");
		String password = scanner.nextLine();
		try {
			system.loginUser(username, password);
		} catch (UserNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidPasswordException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void addTask() {
		System.out.println("==Add Task==");
		System.out.print("Enter task description: ");
		String task = scanner.nextLine();
		try {
			system.addTask(task);
		} catch (TaskNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void viewTasks() {
		System.out.println("==View Tasks==");
		List<ToDo> tasks = system.viewTasks();
		if (tasks.isEmpty()) {
			System.out.println("No tasks found.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ". " + tasks.get(i).getTask() + 
				(tasks.get(i).isCompleted() ? " (Completed)" : " (Not Completed)"));
			}
		}
	}

	private static void markTaskAsCompleted() {
		System.out.println("==Mark Task Completed==");
		List<ToDo> tasks = system.viewTasks();
		if (tasks.isEmpty()) {
			System.out.println("No tasks found.");
			return;
		}
		System.out.print("Enter the task number to mark as completed: ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine();
		try {
			system.markTaskAsCompleted(taskNumber - 1);
		} catch (TaskNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void deleteTask() {
		System.out.println("==Delete Task==");
		List<ToDo> tasks = system.viewTasks();
		if (tasks.isEmpty()) {
			System.out.println("No tasks found.");
			return;
		}
		System.out.print("Enter the task number to delete: ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine();
		try {
			system.removeTask(taskNumber - 1);
		} catch (TaskNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void logout() {
		try {
			system.logoutUser();
			System.out.println("Logged out successfully.");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
