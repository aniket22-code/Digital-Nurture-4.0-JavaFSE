package com.library.service;

import com.library.repository.BookRepo;

public class BookService {
	private BookRepo bookRepository;

	public void setBookRepository(BookRepo bookrepo) {
		this.bookRepository = bookrepo;
	}

	public void addBook(String bookName) {
		System.out.println("Adding book: " + bookName);
		bookRepository.saveBook(bookName);
	}
}
