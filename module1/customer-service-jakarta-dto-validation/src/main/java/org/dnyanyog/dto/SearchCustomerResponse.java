package org.dnyanyog.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
public class SearchCustomerResponse {

	@NotNull(message = "Status cannot be null")
	private String status;
	
	@NotNull(message = "Message cannot be null")
	@Size(min = 1, max = 255, message = "Message must be between 1 and 255 characters")
	private String message;
	private long customerCode;
	
	@Autowired
	@NotNull(message = "Customer code cannot be null")
	private CustomerData customerData;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(long customerCode) {
		this.customerCode = customerCode;
	}

	public CustomerData getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
	}
}