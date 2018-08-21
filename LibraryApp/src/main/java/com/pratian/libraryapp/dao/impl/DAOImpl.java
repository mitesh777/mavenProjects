package com.pratian.libraryapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pratian.libraryapp.dao.LibraryDao;
import com.pratian.libraryapp.model.Book;
@Repository
public class DAOImpl implements LibraryDao{

	@Autowired
	EntityManagerFactory factory;
	
	@Override
	public void persistBook(Book book) {
		// TODO Auto-generated method stub
		EntityManager entityManager = factory.createEntityManager();
        //User user = new User("someuser2","password2123");
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        System.out.println("added Book");	
	}

	@Override
	public Book fetchBookByISBN(String isbn) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Book> fetchAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
