package com.mitesh.JPADemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitesh.JPADemo.entities.User;

public class UserDAOImpl {

	EntityManagerFactory factory;

	public UserDAOImpl(EntityManagerFactory factory) {
		super();
		this.factory = factory;
	}

	public void addUser(User user) {
		EntityManager entityManager = factory.createEntityManager();
		// User user = new User("someuser2","password2123");
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		System.out.println("added");
	}

	public User getUser(String username) {
		EntityManager entityManager = factory.createEntityManager();
		User user = entityManager.find(User.class, username);
		return user;
	}

	public void updateUser(User user) {
		EntityManager entityManager = factory.createEntityManager();
		// User user = new User("someuser2","password2123");
		entityManager.getTransaction().begin();
		entityManager.merge(user);
		entityManager.getTransaction().commit();
		System.out.println("updated");
	}

	public void deleteUser(String username) {
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();
		User user = entityManager.find(User.class, username);
		entityManager.remove(user);
		// entityManager.merge(user);
		// entityManager.find(entityClass, primaryKey, lockMode)
		// entityManager.f
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("updated");
	}

}
