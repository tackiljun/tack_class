package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoUpdateService {
	
	
	TodoDAO dao;
	
	
	private TodoUpdateService() {
		this.dao = TodoDAO.getInstance();
				
	}
	
	
	private static TodoUpdateService service = new TodoUpdateService();
	
	
	public static TodoUpdateService getInstance() {
		return service;
	}
	
	
	// TodoDTO 데이터를 받고.
	// DAO의 update 메소드로 전달해서 update 처리.
	public int modify(TodoDTO todo) {
		
		Connection conn = null;
		int result = 0;  // 0은 결과값을 초기화해준 거.
		
		try {
			conn = ConnectionProvider.getConnection();
			
			result = dao.updateByTno(conn, todo);
			
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