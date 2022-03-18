package com.sha.springbootbookseller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.springbootbookseller.model.Book;

public interface IBookRepository extends JpaRepository<Book, Long>{

}
