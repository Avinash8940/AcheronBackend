/**
 * 
 */
package com.bookapp.service;

import java.util.List;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public List<Book> getAll() {
		logger.info("inside the getAll method");
		List<Book> bookList=bookRepository.findAll();
		if(bookList.isEmpty()) {
			logger.warn("data not available");
			throw new BookNotFoundException("book not found");
		}
		logger.info("got the data");
		return bookList;
	}

	/**
	 *
	 */
	@Override
	public Book getById(int id) {
		logger.info("inside the getById method");
		return bookRepository
				.findById(id)
				.orElseThrow(()->new BookNotFoundException("invalid Id"));
	}

	/**
	 *
	 */
	@Override
	public List<Book> findByAscSorting(String field) {
		logger.info("inside the sort method");
		 Sort sort = Sort.by(field).ascending();
		 List<Book> bookList=bookRepository.findAll(sort);
		 if(bookList.isEmpty()) {
			 logger.warn("data not available");
			 throw new BookNotFoundException("Book Not Found");
		 }
		 logger.info("got the data");
		 return bookList;
	}
	
	
	/**
	 *
	 */
	@Override
	public List<Book> findByDescSorting(String field) {
		logger.info("inside the sort method");
		 Sort sort = Sort.by(field).descending();
		 List<Book> bookList=bookRepository.findAll(sort);
		 if(bookList.isEmpty()) {
			 logger.warn("data not available");
			 throw new BookNotFoundException("Book Not Found");
		 }
		 logger.info("got the data");
		 return bookList;
	}
	

	/**
	 *
	 */
	@Override
	public Page<Book> findByPagination(int pageNumber, int pageSize) {
		logger.info("inside the pagination method");
		Pageable page = PageRequest.of(pageNumber, pageSize);
		Page<Book> bookList=bookRepository.findAll(page);
		if(bookList.isEmpty()) {
			 logger.warn("data not available");
			throw new BookNotFoundException("Book Not Found");
		}
		logger.info("got the data");
		return bookList;
	}

}
