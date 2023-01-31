/**
 * 
 */
package com.bookapp.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;



import com.bookapp.model.Book;

/**
 * @author AvinashSankineni
 *
 */
public interface IBookRepository extends Neo4jRepository<Book, Integer>{

}
