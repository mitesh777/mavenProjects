package com.pratian.libraryapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pratian.libraryapp.model.Book;
import com.pratian.libraryapp.services.LibraryService;

@Controller
public class HomeController {
	@Autowired
	LibraryService service;
	
	@RequestMapping(value = "/")
	public String home() {
		//service.addBook(new Book("123","save","a","fiction",123.51,12,1));
		System.out.println("hello");
		return "home";
	}
}
