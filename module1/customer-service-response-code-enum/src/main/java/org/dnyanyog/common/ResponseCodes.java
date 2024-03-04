package org.dnyanyog.common;

public enum ResponseCodes {
	
	
	 ADD_CUSTOMER_SUCCESS("Success","Customer added Successfully"),
	
	 ADD_CUSTOMER_DUPLICATE_EMAIL("Fail","Email is already exist! Please enter valid emailID"),
	
	 CUSTOMER_NOT_FOUND("Fail","Customer not present"),
	
	CUSTOMER_DETAILS_FOUND("Success","Customer details are as follows:");
	
	
	private final String message;
	private final String status;

	ResponseCodes(String message,String status) {
		
		this.message = message;
		this.status =status;
	}

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}

	

}