package com.erlangga.day9;

public class ToDo implements ToDoTable {
	private String task;
	private boolean isCompleted;

	public ToDo(String task) {
		this.task = task;
		this.isCompleted = false;
	}

	public String getTask() {
		return task;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean completed) {
		isCompleted = completed;
	}

	@Override
	public void printInformationAdd() {
		System.out.println("Task added: " + task);
	}

	@Override
	public void printInformationRemove() {
		System.out.println("Task removed: " + task);
	}

	@Override
	public void printAllInformation() {
		System.out.println("Task: " + task);
		System.out.println("Status: " + (isCompleted ? "Completed" : "Not Completed"));
	}

	@Override
	public void printInformationMarkAsCompleted() {
		System.out.println("Task successfully marked as completed: " + task);
	}
}
