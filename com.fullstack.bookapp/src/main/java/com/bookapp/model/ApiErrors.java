package com.bookapp.model;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;

/**
 * @author AvinashSankineni
 *
 */
public class ApiErrors {
	LocalDateTime timestamp;
	String message;
	HttpStatus status;
	int statuscode;
	String error;
	public ApiErrors() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param timestamp 
	 * @param message
	 * @param status
	 * @param statuscode
	 * @param error
	 */
	public ApiErrors(LocalDateTime timestamp, String message, HttpStatus status, int statuscode, String error) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.status = status;
		this.statuscode = statuscode;
		this.error = error;
	}
	
	/**
	 * @return the timestamp
	 */
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	/**
	 * @return the statuscode
	 */
	public int getStatuscode() {
		return statuscode;
	}
	/**
	 * @param statuscode the statuscode to set
	 */
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "ApiErrors [timestamp=" + timestamp + ", message=" + message + ", status=" + status + ", statuscode="
				+ statuscode + ", error=" + error + "]";
	}
	
	

}
