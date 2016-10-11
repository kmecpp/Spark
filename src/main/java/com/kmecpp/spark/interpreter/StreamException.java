package com.kmecpp.spark.interpreter;

public class StreamException extends Exception {

	private static final long serialVersionUID = 3974529266100395197L;

	public StreamException() {
	}

	public StreamException(String message) {
		super(message);
	}

	public StreamException(Throwable cause) {
		super(cause);
	}

	public StreamException(String message, Throwable cause) {
		super(message, cause);
	}

}
