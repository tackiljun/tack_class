package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoViewService {
	
	TodoDAO dao;
	
	private TodoViewService() {
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoViewService service = new TodoViewService();
	
	public static TodoViewService getInstance() {
		return service;
	}
	
	// tno 값을 전달받아서.
	// DAO 에 있는 selectByTno 메소드에 요청 => TodoDTO => 반환.
	public TodoDTO getTodo(int tno) {
		
		Connection conn = null;
		TodoDTO todo = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			todo = dao.selectByTno(conn, tno);
			
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
		
		return todo;
		
	}
	

	
}