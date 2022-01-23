package com.zee.zee5app.exception;

import lombok.ToString;

@ToString
public class MovieIdNotFoundException extends Exception {
	public MovieIdNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
}
}