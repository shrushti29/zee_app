package com.zee.zee5app.exception;

import lombok.ToString;

@ToString


public class SeriesNotFoundException extends Exception {
	public SeriesNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}