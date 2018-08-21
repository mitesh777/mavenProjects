package com.pratian.libraryapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratian.libraryapp.dao.LibraryDao;
import com.pratian.libraryapp.model.Author;
import com.pratian.libraryapp.model.Book;
import com.pratian.libraryapp.model.User;
import com.pratian.libraryapp.services.LibraryService;

@Service
public class ServicesImpl implements LibraryService {
	
	@Autowired
	LibraryDao dao;
	
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		dao.persistBook(book);
	}

	public Book getBookByISBN(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public int validateUser(User user) {
		
		return dao.checkUserCredentials(user);
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return dao.persistUser(user);
	}

	public List<Author> getAllAuthors() {
		// TODO Auto-generated method stub
		return dao.fetchAllAuthors();
	}

	

}