package com.erlangga.day8A;

import java.util.UUID;

public class Ticket implements Ticketable {
	private final String ticketId;
	private final String eventName;
	private final double price;
	private static int totalTicketsSold = 0;

	public Ticket(String eventName, double price) {
		this.ticketId = UUID.randomUUID().toString();
		this.eventName = eventName;
		this.price = price;
	}

	public String getTicketId() {
		return ticketId;
	}

	public String getEventName() {
		return eventName;
	}

	public double getPrice() {
		return price;
	}

	public static int getTotalTicketsSold() {
		return totalTicketsSold;
	}

	public static void incrementTotalTicketsSold() {
		totalTicketsSold++;
	}

	public static void decrementTotalTicketsSold() {
		if (totalTicketsSold > 0) {
			totalTicketsSold--;
		}
	}

	@Override
	public void printTicketDetails() {
		System.out.println("Ticket ID: " + ticketId);
		System.out.println("Event Name: " + eventName);
		System.out.println("Price: $" + price);
	}
}
