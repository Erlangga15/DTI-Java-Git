package com.erlangga.day11;

public class DynamicStack {
	private Node top;
	private int size;

	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public DynamicStack() {
		this.top = null;
		this.size = 0;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		int data = top.data;
		top = top.next;
		size--;
		return data;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		return size;
	}
}
