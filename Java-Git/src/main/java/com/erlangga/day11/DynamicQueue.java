package com.erlangga.day11;

public class DynamicQueue {
	private Node front;
	private Node rear;
	private int size;

	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public DynamicQueue() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		int data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		return data;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return front.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void printQueue() {
		Node current = front;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();	
	}
}