package com.mitesh.JPADemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.mitesh.JPADemo.entities.Employee;

public class EmployeeDAOImpl {
	
	EntityManagerFactory factory;
	
	public EmployeeDAOImpl(EntityManagerFactory factory) {
		super();
		this.factory = factory;
	}
    
	public void addEmployee(Employee emp) {
		EntityManager entityManager = factory.createEntityManager();
        //User user = new User("someuser2","password2123");
        entityManager.getTransaction().begin();
        entityManager.persist(emp);
        entityManager.getTransaction().commit();
        System.out.println("added employee");	
	}
	
	public List<Employee> getAllEmployees(){
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
		List<Employee> empList = query.getResultList();
		entityManager.close();
		return empList;
	}
	
	public List<Employee> getAllFTEmployees(){
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Employee> query = entityManager.createQuery("from FullTimeEmployee", Employee.class);
		List<Employee> empList = query.getResultList();
		entityManager.close();
		return empList;
	}
	
	public List<Employee> getAllContractEmployees(){
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Employee> query = entityManager.createQuery("from ContractEmployee", Employee.class);
		List<Employee> empList = query.getResultList();
		entityManager.close();
		return empList;
	}
}
