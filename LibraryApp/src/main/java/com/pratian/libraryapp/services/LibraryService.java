package com.pratian.libraryapp.services;

import java.util.List;

import com.pratian.libraryapp.model.Book;

public interface LibraryService {
	void addBook(Book book);
	
	Book getBookByISBN(String isbn);
	
	List<Book> getAllBooks();

}
