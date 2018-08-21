package com.pratian.libraryapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pratian.libraryapp.dao.LibraryDao;
import com.pratian.libraryapp.model.Author;
import com.pratian.libraryapp.model.Book;
import com.pratian.libraryapp.model.User;

@Repository
public class DAOImpl implements LibraryDao {

	@Autowired
	EntityManagerFactory factory;

	public void persistBook(Book book) {
		// TODO Auto-generated method stub
		EntityManager entityManager = factory.createEntityManager();
		// User user = new User("someuser2","password2123");
		entityManager.getTransaction().begin();
		entityManager.persist(book);
		entityManager.getTransaction().commit();
		System.out.println("added Book");
	}

	public Book fetchBookByISBN(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> fetchAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public int checkUserCredentials(User user) {
		// TODO Auto-generated method stub
		String username1 = user.getUsername();
		String password1 = user.getPassword();
		EntityManager entityManager = factory.createEntityManager();

		String query = "select u from User u where u.username=?1 and u.password=?2";
		// query.setString("value", "Some value with : in it");
		TypedQuery<User> q = entityManager.createQuery(query, User.class);
		q.setParameter(1, username1);
		q.setParameter(2, password1);
		System.out.println("here i was");

		if (q.getResultList().size() > 0) {
			return 0;
		}

		query = "select u from User u where u.username =?1";
		q = entityManager.createQuery(query, User.class);
		q.setParameter(1, username1);
		// q.setParameter(2, password1);
		if (q.getResultList().size() > 0) {
			return 1;
		}
		return 2;
	}

	public int persistUser(User user) {
		// TODO Auto-generated method stub

		EntityManager entityManager = factory.createEntityManager();
		// User user = new User("someuser2","password2123");
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		System.out.println("added user");

		return 0;
	}

	public List<Author> fetchAllAuthors() {
		// TODO Auto-generated method stub
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Author> query = entityManager.createQuery("from Author", Author.class);
		List<Author> authors = query.getResultList();
		entityManager.close();
		return authors;
	}

}
