package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.service.BookService;
import book.util.BookDTO;


@WebServlet("/list")
public class BookList extends HttpServlet {


	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		System.out.println("겟으로 들어옴.....");
		
		// service를 통해서 db를 가져온다.
		BookService bookService = new BookService();
		List<BookDTO> list = bookService.selectService();
		
		request.setAttribute("booklist", list);
		
		
		String viewPath = "/WEB-INF/views/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);

	}


	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {

	}

}
