package org.kp.lms.controller;

import java.util.List;

import org.kp.lms.entity.Book;
import org.kp.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LMSController {
	
	@Autowired
	BookService bookService;

	@RequestMapping("/listofbooks")
	public List<Book> getBookDetails(){
		
		List<Book> books= bookService.getBookDetails();
		
		books.add(new Book(2, "Hobbit", 50));
		books.add(new Book(3, "GOT", 51));
		books.add(new Book(4, "POPOYE", 54));
		return books;
	}
	
	@RequestMapping(value="/addbook", method = RequestMethod.POST)
	public String addBook(@RequestBody Book book){
		
		bookService.saveBook(book);
		return "success";
	}
}
