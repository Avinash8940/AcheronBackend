/**
 * 
 */
package com.bookapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.controller.BookController;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

/**
 * @author AvinashSankineni
 *
 */
@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	private IBookRepository bookRepository;
	
	private Logger logger=LoggerFactory.getLogger(BookController.class);

	/**
	 *
	 */
	@Override
	public Book addBook(Book book) {
		logger.info("inside the addBook method");
		System.out.println(book);
		return bookRepository.save(book);
		
	}

	/**
	 *
	 */
	@Override
	public void deleteBook(int id) {
		logger.info("inside the delete method");
		bookRepository.deleteById(id);
		
	}

	/**
	 *
	 */
	@Override
	public void updateBook(Book book) {
		logger.info("inside the update method");
		if(bookRepository.save(book)==null)		
			throw new BookNotFoundException("Book not found");
		else
			logger.info("got the data");
			bookRepository.save(book);
	}
}
