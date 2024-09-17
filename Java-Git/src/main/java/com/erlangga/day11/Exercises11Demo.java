package com.erlangga.day11;

import java.util.InputMismatchException;
import com.erlangga.day11.utils.UserInput;
import java.util.Scanner;

public class Exercises11Demo {
	private static Scanner scanner = new Scanner(System.in);

	public static void runExercises11Demo() {
		while (true) {
			try {
				System.out.println("Exercises 11 Demo");
				System.out.println("1. Dynamic Stack");
				System.out.println("2. Dynamic Queue");
				System.out.println("3. Dynamic Binary Search Tree");
				System.out.println("4. Exit");
				int choice = UserInput.inputInteger("Enter your choice: ");
				switch (choice) {
				case 1:
					demonstrateDynamicStack();
					break;
				case 2:
					demonstrateDynamicQueue();
					break;
				case 3:
					demonstrateDynamicBinarySearchTree();
					break;
				case 4:
					System.out.println("Exiting...");
					scanner.close();
					return;
				default:
						System.out.println("Invalid choice");
					}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
			}
		}
	}

	private static void demonstrateDynamicStack() {
		DynamicStack stack = new DynamicStack();

		System.out.println("Pushing elements to the stack:");
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
			System.out.println("Pushed: " + i + " - Stack size: " + stack.size());
		}

		System.out.println("Peeking at the top element: " + stack.peek());

		System.out.println("Popping elements from the stack:");
		while (!stack.isEmpty()) {
			System.out.println("Popped: " + stack.pop() + " - Stack size: " + stack.size());
		}
	}

	private static void demonstrateDynamicQueue() {
		DynamicQueue queue = new DynamicQueue();

		System.out.println("Enqueuing elements to the queue:");
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			System.out.println("Enqueued: " + i + " - Queue size: " + queue.size());
		}

		System.out.println("Peeking at the front element: " + queue.peek());

		System.out.println("Dequeuing elements from the queue:");
		while (!queue.isEmpty()) {
			System.out.println("Dequeued: " + queue.dequeue() + " - Queue size: " + queue.size());
		}
	}

	private static void demonstrateDynamicBinarySearchTree() {
		DynamicBinarySearchTree binarySearchTree = new DynamicBinarySearchTree();

		try {
			int numberOfElements = UserInput.inputInteger("Enter the number of elements to insert: ");

			for (int i = 1; i <= numberOfElements; i++) {
				int element = UserInput.inputInteger("Enter the element to insert: ");
				binarySearchTree.insert(element);
				System.out.println("Inserted: " + element);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		while (true) {
			String input = UserInput.inputString("Enter the element to search (or enter 'q' to exit): ");
			if (input.equalsIgnoreCase("q")) {
				break;
			}

			try {
				int element = Integer.parseInt(input);
				if (binarySearchTree.search(element)) {
					System.out.println("Element " + element + " found in the BST.");
				} else {
				System.out.println("Element " + element + " not found in the BST.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter an integer or 'q' to exit.");
			}
		}
	}
}
