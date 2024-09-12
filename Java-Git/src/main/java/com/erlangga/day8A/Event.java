package com.erlangga.day8A;

public class Event {
	private final String eventName;
	private final String eventDate;
	private final String eventLocation;
	private final double ticketPrice;
	private int availableTickets;
	private int bookedTickets;

	public Event(String eventName, String eventDate, String eventLocation, double ticketPrice, int totalTickets) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventLocation = eventLocation;
		this.ticketPrice = ticketPrice;
		this.availableTickets = totalTickets;
		this.bookedTickets = 0;
	}

	public String getEventName() {
		return eventName;
	}

	public String getEventDate() {
		return eventDate;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public int getBookedTickets() {
		return bookedTickets;
	}

	// Ticket Validation
	public boolean bookTicket() {
			if (availableTickets > 0) {
					availableTickets--;
					bookedTickets++;
					return true;
			}
			return false;
	}

	public void cancelTicket() {
			availableTickets++;
			bookedTickets--;
	}
}
