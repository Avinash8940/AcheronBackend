/**
 * 
 */
package com.bookapp.exceptions;

/**
 * @author AvinashSankineni
 *
 */
public class BookNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public BookNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message is used to pass some message
	 */
	public BookNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
