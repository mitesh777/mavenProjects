package com.pratian.libraryapp.dao;

import java.util.List;

import com.pratian.libraryapp.model.Book;

public interface LibraryDao {
	void persistBook(Book book);
	
	Book fetchBookByISBN(String isbn);
	
	List<Book> fetchAllBooks();
}
