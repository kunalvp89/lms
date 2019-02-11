package org.kp.lms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	int isbn;
	String name;
	int qtty;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQtty() {
		return qtty;
	}
	public void setQtty(int qtty) {
		this.qtty = qtty;
	}
	public Book(int isbn, String name, int qtty) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.qtty = qtty;
	}
	public Book() {
	}
}
