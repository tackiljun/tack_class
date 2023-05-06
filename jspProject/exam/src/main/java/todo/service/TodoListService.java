package todo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoListService {
	
	
    TodoDAO dao = new TodoDAO();
	
	public List<TodoDTO> getList(){
		
		// 데이터 처리.
		// 트렌젝션 처리.
		
		Connection conn = null; 
		List<TodoDTO> list = null;
		
		// try,catch 예외처리.
		try {
			conn = ConnectionProvider.getConnection();
			
			list = dao.selectByAll(conn);
			
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
		
		return list;
	}
	
	
	public TodoDTO getTno() {
		
		TodoDAO dao = new TodoDAO();
		TodoDTO dto = null;
		
		try {
			dto = dao.selectByTno(ConnectionProvider.getConnection() , 6);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
		
		
		
		return dto;
		
	}
	
	
	
}