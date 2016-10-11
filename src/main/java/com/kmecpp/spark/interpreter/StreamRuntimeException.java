package com.kmecpp.spark.interpreter;

public class StreamRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 2573351678578010646L;

	public StreamRuntimeException() {
	}

	public StreamRuntimeException(String message) {
		super(message);
	}

	public StreamRuntimeException(Throwable cause) {
		super(cause);
	}

	public StreamRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

}
