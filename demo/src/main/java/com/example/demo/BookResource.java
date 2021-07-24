package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class BookResource {
	//connect book service
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.findAllBooks();
	}
	
	@GetMapping("/books/{bookId}")
	public Book retriveBook(@PathVariable int bookId) {
		return bookService.findBook(bookId);
	}
	
	@PostMapping("/books")
	public void  createBook(@RequestBody Book book) {
		Book addbook=bookService.addBook(book);
	}
}
