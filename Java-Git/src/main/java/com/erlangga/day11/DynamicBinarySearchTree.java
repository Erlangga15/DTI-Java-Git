package com.erlangga.day11;

public class DynamicBinarySearchTree {
	private Node root;

	private static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}

		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}

		return root;
	}

	public boolean search(int data) {
		return searchRec(root, data);
	}

	private boolean searchRec(Node root, int data) {
		if (root == null) {
			return false;
		}

		if (root.data == data) {
			return true;
		}

		return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
	}
}
