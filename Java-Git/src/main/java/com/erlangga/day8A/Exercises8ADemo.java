package com.erlangga.day8A;

import java.util.List;
import java.util.Scanner;

public class Exercises8ADemo {
	private static TicketingSystem system = new TicketingSystem();
	private static Scanner scanner = new Scanner(System.in);

	public static void runExercises() {
		system.initialize();

		try {
			while (true) {
				System.out.println("\nTicketing System Menu:");
				System.out.println("1. Book Ticket");
				System.out.println("2. Confirm Ticket");
				System.out.println("3. Cancel Ticket");
				System.out.println("4. List Ticket Booked");
				System.out.println("5. List All Ticket -- Only Admin");
				System.out.println("6. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
					case 1:
						bookTicket();
						break;
					case 2:
						confirmTicket();
						break;
					case 3:
						cancelTicket();
						break;
					case 4:
						listTicketBooked();
						break;
					case 5:
						listAllTicket();
						break;
					case 6:
						System.out.println("Thank you for using the ticketing system. Goodbye!");
						scanner.close();
						return;
					default:
						System.out.println("Invalid choice. Please try again.");
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void bookTicket() {
			System.out.println("==Booking a ticket==");
			System.out.println("Available events:");
			List<Event> events = system.getEvents();
			for (int i = 0; i < events.size(); i++) {
					Event event = events.get(i);
					System.out.println((i + 1) + ". " + event.getEventName() + " - " + event.getEventDate() + " - " + event.getEventLocation() + " - $" + event.getTicketPrice());
			}
			
			System.out.print("Enter event number: ");
			int eventChoice = scanner.nextInt();
			scanner.nextLine();
			if (eventChoice > 0 && eventChoice <= events.size()) {
					Event selectedEvent = events.get(eventChoice - 1);
					try {
							Ticket ticket = system.bookTicket(selectedEvent.getEventName());
							System.out.println("==Ticket booked successfully==");
							ticket.printTicketDetails();
					} catch (IllegalArgumentException e) {
							System.out.println("Error: " + e.getMessage());
					}
			} else {
					System.out.println("Invalid event number.");
			}
	}

	private static void confirmTicket() {
			System.out.println("==Confirming a ticket==");
			System.out.print("Enter ticket ID: ");
			String ticketId = scanner.nextLine();

			try {
					system.confirmTicket(ticketId);
			} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
			}
	}

	private static void cancelTicket() {
			System.out.println("==Cancelling a ticket==");
			System.out.print("Enter ticket ID: ");
			String ticketId = scanner.nextLine();

			try {
					system.cancelTicket(ticketId);
					System.out.println("Ticket cancelled successfully.");
			} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
			}
	}

	private static void listTicketBooked() {
		System.out.println("==Ticket Information==");
		system.informationTicket();
	}

	private static void listAllTicket() {
		System.out.println("==All Ticket Information==");
		system.informationAllTicket();
	}
}
