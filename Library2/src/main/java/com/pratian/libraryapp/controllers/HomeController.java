package com.pratian.libraryapp.controllers;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.pratian.libraryapp.model.Author;
import com.pratian.libraryapp.model.Book;
import com.pratian.libraryapp.model.User;
import com.pratian.libraryapp.services.LibraryService;

@Controller
public class HomeController {
	@Autowired
	LibraryService service;
	
	@RequestMapping(value = "/")
	public String home() {
//		Book book = new Book("123","name123","peng","fiction",123.51,51);
//		book.addAuthor(new Author("hello"));
//		service.addBook(book);
		System.out.println("hello");
		return "home";
	}
	@RequestMapping(value = "/login.html")
	public String login(Model model) {
		User user = new User();
		model.addAttribute("userObj", user);
		System.out.println("in login get");
		return "login";
	}
	@RequestMapping(value = "/login.html", method=RequestMethod.POST)
	public String login(@ModelAttribute("userObj") User user, HttpServletRequest request,Model model) {
		String view = "menu";
		//view="login";
		int userType = service.validateUser(user);
		if(userType==0) {
			request.getSession().setAttribute("user", user);
			//model.addAttribute("message","good boy");
			return view;
		}
		if(userType==1)
			model.addAttribute("message","incorrect password");
		
		if(userType==2)
			model.addAttribute("message","user not registered");
		return "login";
	}
	@RequestMapping(value = "/signup.html")
	public String signup(Model model) {
		User user = new User();
		model.addAttribute("userObj", user);
		System.out.println("in signup get");
		return "signup";
	}
	
	@RequestMapping(value = "/signup.html", method=RequestMethod.POST)
	public String signup(@ModelAttribute("userObj") User user,Model model) {
		String view = "signup";
		//view="login";
		int userType = service.validateUser(user);
		if(userType==2) {
			//request.getSession().setAttribute("login", user);
			service.addUser(user);
			model.addAttribute("message","added user, now login");
			return "login";
		}
		model.addAttribute("message","user exists");
		return view;
	}
}
