package com.zee.zee5app.exception;


import lombok.ToString;

@ToString(callSuper = true)
public class InvalidIdException extends Exception {

//	@Override
//	public String toString() {
//		return "�dNotFoundException [toString()=" + super.toString() + "]";
//	}

	public InvalidIdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}