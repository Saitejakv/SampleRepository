package com.cg.App.Exceptions;

public class AccountManagementException extends RuntimeException {
	
	
private static final long serialVersionUID = 1L;
	
	private int code;
	private String message;
	
	
	public AccountManagementException() {
		super();
	}

	
	
	public AccountManagementException(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}



	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	


}
