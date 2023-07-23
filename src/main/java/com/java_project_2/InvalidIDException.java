package com.java_project_2;

@SuppressWarnings("serial")
public class InvalidIDException extends Exception {

	String message;

	public InvalidIDException() {
		this.message = "Invalid ID!";
	}

	public InvalidIDException(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}
}
