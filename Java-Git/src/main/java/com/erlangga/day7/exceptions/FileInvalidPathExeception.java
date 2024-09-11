package com.erlangga.day7.exceptions;

public class FileInvalidPathExeception extends RuntimeException {
	public FileInvalidPathExeception() {
		super("File path is invalid.");
	}
}
