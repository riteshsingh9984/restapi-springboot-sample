package com.example.webusers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webusers.modals.Book;
import com.example.webusers.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book save(Book book) {
		
		return bookRepository.save(book);
	}
	
	public List<Book> getAllBookList(){
		
		return bookRepository.findAll();
	}
}
