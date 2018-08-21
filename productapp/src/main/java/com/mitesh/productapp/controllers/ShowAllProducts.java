package com.mitesh.productapp.controllers;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mitesh.productapp.dao.UserDAOImpl;
import com.mitesh.productapp.entities.Product;

/**
 * Servlet implementation class ShowAllProducts
 */
public class ShowAllProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllProducts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Product product = new Product();
		System.out.println("show all products");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EcommerceApp");
		UserDAOImpl dao = new UserDAOImpl(factory);
		//System.out.println(dao.fetchAllProducts());
		
		List<Product> products = dao.fetchAllProducts();
		request.setAttribute("allProducts", products);
		System.out.println(dao.getByBrand("apple"));
		request.setAttribute("message", "all products");
		RequestDispatcher dispatcher = request.getRequestDispatcher("productsDescriptor.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
