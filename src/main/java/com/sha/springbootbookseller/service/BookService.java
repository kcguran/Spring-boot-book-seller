package com.sha.springbootbookseller.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.springbootbookseller.model.Book;
import com.sha.springbootbookseller.repository.IBookRepository;

@Service
public class BookService implements IBookService{

	@Autowired
	private IBookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		book.setCreateTime(LocalDateTime.now());
		return bookRepository.save(book);
	}
	
	@Override
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
	@Override
	public List<Book> findAllBooks(){
		return bookRepository.findAll();
	}
}
