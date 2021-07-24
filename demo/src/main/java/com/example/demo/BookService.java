package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;


public class BookService {
	
	//create list
	private static List<Book> books=new ArrayList<Book>();
	
	//create book count
	private static int bookCount =3;
	
	//add books on the list
	static {
		books.add(new Book(1,"Harry Potter",new Date()));
		books.add(new Book(2,"Twiligth",new Date()));
		books.add(new Book(3,"Games",new Date()));
	}
	
	//method
	public List<Book> findAllBooks(){
		return books;
	}
	
	//method
	public Book addBook(Book book) {
		if(book.getBookId()== null) {
			book.setBookId(bookCount++);
		}
		books.add(book);
		return book;
	}
	//method for find book
	public Book findBook(int id) {
		for(Book book :books) {
			if(book.getBookId()==id) {
				return book;
			}
		}
		return null;
	}
}
