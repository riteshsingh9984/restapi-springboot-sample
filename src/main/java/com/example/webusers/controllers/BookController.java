package com.example.webusers.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.webusers.modals.Book;
import com.example.webusers.services.BookService;

@Controller
@RequestMapping("book")
public class BookController {
	
	private static final String VIEWS = "books/";
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("add")
	public String getBookForm() {
		return VIEWS+"add-book";
	}
	
	@PostMapping("submit")
	public String saveBook(Book book,ModelAndView mv) {
		bookService.save(book);
		return "redirect:/book";
	}
	
	@GetMapping("")
	public ModelAndView getBookList(ModelAndView mv) {
		
		mv.setViewName(VIEWS+"book-list");
		
		List<Book> books = bookService.getAllBookList();
		
		mv.addObject("books",books);
		return mv;
	}
}
