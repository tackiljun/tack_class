package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.RequestTodo;
import todo.util.ConnectionProvider;

public class TodoInsertService {
	
	
	TodoDAO dao;
	
	
	private static TodoInsertService service = new TodoInsertService();
	
	
	private TodoInsertService() {
		this.dao = TodoDAO.getInstance();
	}
	
	
	public static TodoInsertService getInstance() {
		return service;
	}
	
	
	// 입력의 요청을 처리하는 메소드가 필요, 
	// RequestTodo 전달받고 Dao메소드에 요청. 
	public int register(RequestTodo todo) {
		
		Connection conn = null;
		int result = 0;  // 0은 결과값을 초기화해준 거.
		
		try {
			conn = ConnectionProvider.getConnection();
			
			result = dao.insertTodo(conn, todo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	
	
}