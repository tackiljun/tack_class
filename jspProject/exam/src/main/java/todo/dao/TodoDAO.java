package todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoDAO {
	
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
	public TodoDTO selectByTno(Connection conn, int tno) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		TodoDTO dto = null;
		
		
		// sql
		String sql = "select * from tbl_todo where tno=?";
		
		// sql 가져온거 try,catch.
		try {
			pstmt = conn.prepareStatement(sql);
			// set.
			pstmt.setInt(1, tno);
			
			// rs.
			rs = pstmt.executeQuery();

			if(rs.next()) {
				dto = new TodoDTO(rs.getInt("tno") , rs.getString("todo") , rs.getString("duedate") ,rs.getBoolean("finished"));
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
		
		return dto;
	}
	
	public static void main(String[] args) {
		 
//		TodoDAO dao = new TodoDAO();
//		try {
//			
//			dao.selectByTno(ConnectionProvider.getConnection() , 6);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}
	

}