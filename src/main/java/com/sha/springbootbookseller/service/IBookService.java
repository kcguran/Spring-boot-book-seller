package com.sha.springbootbookseller.service;

import java.util.List;

import com.sha.springbootbookseller.model.Book;

public interface IBookService {

	Book saveBook(Book book);

	void deleteBook(Long id);

	List<Book> findAllBooks();

}
