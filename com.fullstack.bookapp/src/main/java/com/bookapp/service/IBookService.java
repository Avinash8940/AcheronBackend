/**
 * 
 */
package com.bookapp.service;

import java.util.List;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookapp.model.Book;

/**
 * @author AvinashSankineni
 *
 */
public interface IBookService {
	
	/**
	 * @param book is used to get the book details
	 */
	Book addBook(Book book);
	
	/**
	 * @param id is used to get the book by id
	 */
	void deleteBook(int id);

	/**
	 * @param book is used to get the book details
	 */
	void updateBook(Book book);
	
}
