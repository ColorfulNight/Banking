package com.banking;

public class OverdraftException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double deficit;
	
	public OverdraftException(String message,double deficit) {
		super(message);
		this.deficit=deficit;
	}

	public OverdraftException(String message) {
		super(message);
	}

	public double getDeficit() {
		return deficit;
	}
	
	
}
