package com.examples.exception;

public class InvalidInputException extends RuntimeException {
	public InvalidInputException(String s) {
		super(s);
	}
}