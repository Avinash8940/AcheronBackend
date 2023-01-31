/**
 * 
 */
package com.bookapp.controller;

import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/book-getApi")
@CrossOrigin("http://localhost:4200")
public class BookController {
	private Logger logger=LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private IBookService bookService;
	
	/**
	 * @return the list of books
	 */
	@GetMapping("/books")
	@PreAuthorize("hasAnyRole('Manager','Editor','User')")
	ResponseEntity<List<Book>> getAll(){
		System.out.println("inside getAll method");
		logger.info("getting list of books");
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of books");
		List<Book>book=bookService.getAll();
		return ResponseEntity.ok().headers(header).body(book);
	}
	
	/**
	 * @param id is used to get the book details
	 * @return the book details
	 */
	@GetMapping("getById/id/{id}")
	@PreAuthorize("hasAnyRole('Manager','Editor','User')")
	ResponseEntity<Book> getById(@PathVariable("id") int id){
		logger.info("getting the book by Id");
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "get book by Id");
		return ResponseEntity.ok().headers(header).body(bookService.getById(id));
	}
	
	/**
	 * @param field is used to pass the field name for Asc sorting
	 * @return the bookDetails with sorting
	 */
	@GetMapping("/AscSortBy/{field}")
	@PreAuthorize("hasAnyRole('Manager','Editor','User')")
	ResponseEntity<List<Book>> getByAscSort(@PathVariable("field") String field){
		logger.info("doing sorting by any field");
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "sorting by any field");
		return ResponseEntity.ok().headers(header).body(bookService.findByAscSorting(field));
	}
	
	/**
	 * @param field is used to pass the field name for Desc sorting
	 * @return the bookDetails with sorting
	 */
	@GetMapping("/DescSortBy/{field}")
	@PreAuthorize("hasAnyRole('Manager','Editor','User')")
	ResponseEntity<List<Book>> getByDescSort(@PathVariable("field") String field){
		logger.info("doing sorting by any field");
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "sorting by any field");
		return ResponseEntity.ok().headers(header).body(bookService.findByDescSorting(field));
	}
	
	/**
	 * @param pageNumber is used to mention the page
	 * @param pageSize is used to mention the list of books
	 * @return the list of data
	 */
	@GetMapping("/pagination/{pageNumber}/{pageSize}")
	@PreAuthorize("hasAnyRole('Manager','Editor','User')")
	ResponseEntity<Page<Book>> findByPagination(@PathVariable int pageNumber, @PathVariable int pageSize){
		logger.info("doing pagination");
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "pagination");
		return ResponseEntity.ok().headers(header).body(bookService.findByPagination(pageNumber, pageSize));
	}
}
