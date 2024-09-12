package com.erlangga.day9;

import java.util.UUID;

public class User implements UserTable {
	private final String id;
	private final String username;
	private final String password;
	private boolean isUserLoggedIn;

	public User(String username, String password) {
		this.id = UUID.randomUUID().toString();
		this.username = username;
		this.password = password;
		this.isUserLoggedIn = false;
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean isUserLoggedIn() {
		return isUserLoggedIn;
	}

	public void setUserLoggedIn(boolean isUserLoggedIn) {
		this.isUserLoggedIn = isUserLoggedIn;
	}

	@Override
	public void printInformatinUserRegister() {
		System.out.println("User registered successfully.");
	}

	@Override
	public void printInformatinUserLogin() {
		System.out.println("Login successful.");
	}

	@Override
	public void printInformatinUserLogout() {
		System.out.println("Logout successful.");
	}
}
