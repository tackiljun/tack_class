package todo.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.TodoDTO;
import todo.service.TodoViewService;


@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
	
	
	TodoViewService viewService;
	
	
	public TodoReadController() {
		this.viewService = TodoViewService.getInstance();
	}
	
	
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		// 상세보기 페이지는 get 요청에 화면을 보여주는 처리.	
		
		// 어떤 Todo의 데이터인지 식별한수있는 키데이터를 받아서 처리.
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// no 값으로 Service를 통해서 Todo 정보를 받아온다!!!!!
		TodoDTO todo = viewService.getTodo(no);  // no=2
		
		request.setAttribute("todo", todo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/read.jsp");
		dispatcher.forward(request, response);
	}


	
}