package com.erlangga.day8A;

import java.util.ArrayList;
import java.util.List;

public class TicketingSystem {
	private final List<Event> events;
	private final List<Ticket> tickets;

	public TicketingSystem() {
		this.events = new ArrayList<>();
		this.tickets = new ArrayList<>();
	}

	public void initialize() {
		events.add(new Event("Event 1", "2024-01-01", "Location 1", 100, 5));
		events.add(new Event("Event 2", "2024-02-15", "Location 2", 200, 5));
		events.add(new Event("Event 3", "2024-03-30", "Location 3", 300, 5));
	}

	public List<Event> getEvents() {
		return new ArrayList<>(events);
	}

	public List<Ticket> getTickets() {
		return new ArrayList<>(tickets);
	}

	public Ticket bookTicket(String eventName) {
		Event event = findEventByName(eventName);
		if (event == null) {
			throw new IllegalArgumentException("Event not found: " + eventName);
		}
		if (!event.bookTicket()) {
			throw new IllegalArgumentException("No available tickets for event: " + eventName);
		}

		// Create a new ticket
		Ticket ticket = new Ticket(event.getEventName(), event.getTicketPrice());
		tickets.add(ticket);
		Ticket.incrementTotalTicketsSold();
		return ticket;
	}

	public void cancelTicket(String ticketId) {
    Ticket ticket = findTicketById(ticketId);
			if (ticket == null) {
					throw new IllegalArgumentException("Ticket not found: " + ticketId);
			}
			Event event = findEventByName(ticket.getEventName());
			event.cancelTicket();
		tickets.remove(ticket);
		Ticket.decrementTotalTicketsSold();
	}

	public void confirmTicket(String ticketId) {
		Ticket ticket = findTicketById(ticketId);
		if (ticket == null) {
			throw new IllegalArgumentException("Ticket not found: " + ticketId);
		}
		System.out.println("Thank you for booking the ticket !");
		System.out.println("Your ticket has been confirmed with the following details:");
		ticket.printTicketDetails();
	}

	public void informationTicket() {
		for (Event event : events) {
			System.out.println("Event: " + event.getEventName());
			System.out.println("Available Tickets: " + event.getAvailableTickets());
			System.out.println("Booked Tickets: " + event.getBookedTickets());
			System.out.println("--------------------");
		}
	}

	public void informationAllTicket() {
		if (tickets.isEmpty()) {
			System.out.println("No tickets booked yet.");
		} else {
			for (Ticket ticket : tickets) {
				System.out.println("Ticket ID: " + ticket.getTicketId());
				System.out.println("Event Name: " + ticket.getEventName());
				System.out.println("Price: $" + ticket.getPrice());
				System.out.println("--------------------");
			}
			System.out.println("Total Tickets Sold: " + Ticket.getTotalTicketsSold());
		}
	}

	private Event findEventByName(String eventName) {
		return events.stream()
				.filter(event -> event.getEventName().equals(eventName))
				.findFirst()
				.orElse(null);
	}

	private Ticket findTicketById(String ticketId) {
		return tickets.stream()
				.filter(ticket -> ticket.getTicketId().equals(ticketId))
				.findFirst()
				.orElse(null);
	}
}
