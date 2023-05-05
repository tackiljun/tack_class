package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.TodoDTO;

public class TodoDAO {
	
	
	// 기본생성자.
	private TodoDAO() {
	}
	
	
	// private static.
	private static TodoDAO dao = new TodoDAO();
	
	public static TodoDAO getInstance() {
		return dao;
	}
	
	
	
	// TodoDAO 리스트를 메소드 반환하자.
	public List<TodoDTO> selectByAll(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<TodoDTO> list = null;
		
		// sql 을 String 으로.
		String sql = "select * from tbl_todo";
		
		// pstmt 를 try/catch 로.
		try {
			pstmt = conn.prepareStatement("sql");
			
			rs =pstmt.executeQuery();
			
			list = new ArrayList<TodoDTO>();
			
			TodoDTO todo = new TodoDTO(
					rs.getInt("tno"), 
					rs.getString("todo"), 
					rs.getString("duedate"), 
					rs.getBoolean("finished"));
			
			while(rs.next()) {
				list.add(todo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	// TodoDTO 에서 tno 정보를 받아 메소드 반환.
	private TodoDTO selectByTno(Connection conn, int tno) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		TodoDTO todo = null;
		
		
		// sql
		String sql = "select * from tbl_todo where tno=?";
		
		// sql 가져온거 try,catch.
		try {
			pstmt = conn.prepareStatement(sql);
			
			// set.
			
			
			// rs.
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
		return todo;
	}
	
	
	

}