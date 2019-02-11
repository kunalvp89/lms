package org.kp.lms.service;

import java.util.ArrayList;
import java.util.List;

import org.kp.lms.dao.BookDao;
import org.kp.lms.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookDao bookdao;

	public List<Book> getBookDetails(){
		
		List<Book> books = new ArrayList<>();
		bookdao.findAll().iterator().forEachRemaining(books::add);
		return books;
	}
	
	public void saveBook(Book book){
		
		bookdao.save(book);
	}
}
