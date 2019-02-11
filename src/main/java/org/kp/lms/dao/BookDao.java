package org.kp.lms.dao;

import java.util.List;

import org.kp.lms.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book, Integer>{

	List<Book> findByName(String name);
}
