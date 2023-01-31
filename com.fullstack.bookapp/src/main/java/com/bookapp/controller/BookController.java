/**
 * 
 */
package com.bookapp.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

/**
 * @author AvinashSankineni
 *
 */
@RestController
@RequestMapping("/book-crudApi")
@CrossOrigin("http://localhost:4200")
public class BookController {
	private Logger logger=LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private IBookService bookService;
	
	/**
	 * @param book is used to pass the book data
	 * @return response status
	 */
	@PostMapping("/addBook")
	@PreAuthorize("hasAnyRole('Manager')")
	ResponseEntity<Void> addBook(@RequestBody Book book) {
		System.out.println(book);
		logger.info("adding book");
		bookService.addBook(book);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	/**
	 * @param id is used to get the book by id
	 * @return response status
	 */
	@DeleteMapping("/deleteById/{id}")
	@PreAuthorize("hasAnyRole('Manager')")
	ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
		System.out.println("inside deleteBook method");
		logger.info("deleting book");
		System.out.println("Before deleting");
		bookService.deleteBook(id);
		System.out.println("After deleting");
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	/**
	 * @param book is used to pass the book data
	 * @return response status
	 */
	@PutMapping("/updateBook")
	@PreAuthorize("hasAnyRole('Manager','Editor')")
	ResponseEntity<Void> updateBook( @RequestBody Book book ) {
		System.out.println("inside update method");
		logger.info("updating the book");
		bookService.updateBook(book);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
}
