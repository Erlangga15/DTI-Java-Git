package com.erlangga.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.HashMap;

import com.erlangga.day9.exceptions.UserNotFoundException;
import com.erlangga.day9.exceptions.InvalidPasswordException;
import com.erlangga.day9.exceptions.TaskNotFoundException;

public class ToDoSystem {
	private Map<String, List<ToDo>> userTasks;
	private List<User> users;
	private String currentUserId;

	public ToDoSystem() {
		this.userTasks = new HashMap<>();
		this.users = new ArrayList<>();
		this.currentUserId = null;
	}

	public List<ToDo> getTasks() {
		return getCurrentUser()
				.map(user -> new ArrayList<>(userTasks.getOrDefault(user.getId(), new ArrayList<>())))
				.orElse(new ArrayList<>());
	}

	public Optional<User> getCurrentUser() {
		return currentUserId == null ? Optional.empty() : findUserById(currentUserId);
	}

	public void registerUser(String username, String password) {
		if (findUserByUsername(username).isPresent()) {
			throw new UserNotFoundException("Username already exists.");
		}
		User user = new User(username, password);
		this.users.add(user);
		user.printInformatinUserRegister();
	}

	public void loginUser(String username, String password) {
		Optional<User> userOpt = findUserByUsername(username);
		if (userOpt.isPresent()) {
			User user = userOpt.get();
			if (user.getPassword().equals(password)) {
				user.setUserLoggedIn(true);
				this.currentUserId = user.getId();
				user.printInformatinUserLogin();
			} else {
				throw new InvalidPasswordException("Invalid password.");
			}
		} else {
			throw new UserNotFoundException("User not found.");
		}
	}

	public void logoutUser() {
		Optional<User> userOpt = findUserById(currentUserId);
		if (userOpt.isPresent()) {
			User user = userOpt.get();
			user.setUserLoggedIn(false);
			this.currentUserId = null;
			user.printInformatinUserLogout();
		} else {
			throw new UserNotFoundException("User not found.");
		}
	}

	public void addTask(String task) {
		getCurrentUser().ifPresent(user -> {
			ToDo newTask = new ToDo(task);
			userTasks.computeIfAbsent(user.getId(), k -> new ArrayList<>()).add(newTask);
			newTask.printInformationAdd();
		});
	}

	public List<ToDo> viewTasks() {
		return getTasks();
	}
	
	public void removeTask(int index) {
		getCurrentUser().ifPresent(user -> {
			List<ToDo> tasks = userTasks.get(user.getId());
			if (tasks != null && index >= 0 && index < tasks.size()) {
				ToDo removedTask = tasks.remove(index);
				removedTask.printInformationRemove();
			} else {
				throw new TaskNotFoundException("Task not found: " + index);
			}
		});
	}

	public void markTaskAsCompleted(int index) {
		getCurrentUser().ifPresent(user -> {
			List<ToDo> tasks = userTasks.get(user.getId());
			if (tasks != null && index >= 0 && index < tasks.size()) {
				ToDo task = tasks.get(index);
				task.setCompleted(true);
				task.printInformationMarkAsCompleted();
			} else {
				throw new TaskNotFoundException("Task not found: " + index);
			}
		});
	}

	private Optional<User> findUserById(String userId) {
		return users.stream()
				.filter(user -> user.getId().equals(userId))
				.findFirst();
	}

	private Optional<User> findUserByUsername(String username) {
		return users.stream()
				.filter(user -> user.getUsername().equals(username))
				.findFirst();
	}
}
