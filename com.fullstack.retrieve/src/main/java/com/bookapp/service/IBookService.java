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
	 * @return the list of books
	 */
	List<Book> getAll();
	
	/**
	 * @param id is used to get the book by id
	 * @return the book details
	 */
	Book getById(int id);
	
	/**
	 * @param field is used to pass the field name
	 * @return the list of books 
	 */
	List<Book> findByAscSorting(String field);
	
	
	/**
	 * @param field is used to pass the field name
	 * @return the list of books 
	 */
	List<Book> findByDescSorting(String field);
	
	/**
	 * @param pageSize is used to mention the list of books
	 * @param pageNumber is used to mention the page name
	 * @return the list of books
	 */
	Page<Book> findByPagination(int pageNumber,int pageSize);
}
