package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.domain.MemberDTO;
import todo.util.ConnectionProvider;

public class MemberDAO {
	
	// 로그인 처리를 위한 select.
	// uid, pw 비교해서 처리. => MemberDTO.
	public MemberDTO selectByUidPw(Connection conn, String uid, String pw) {
		
		// 반환할 결과데이터 변수선언.
		MemberDTO memberDTO = null;
		
		// sql 실행을 위한 PreparedStatement 객체선언. => try{} finally{close()} 해주려고.
		PreparedStatement pstmt = null;
		
		// select 결과테이블 저장.
		ResultSet rs = null;
		
		// select sql.
		String sql = "select idx, uid, uname, uphoto from member where uid=? and pw=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			// set.
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			
			
			// rs.
			rs = pstmt.executeQuery();  // 결과 행의 갯수가 => 0 or 1.
			
			// if. => MemberDTO 생성해주기.
			if(rs.next()) {
				memberDTO = new MemberDTO(
						rs.getInt("idx"), 
						rs.getString("uid"), 
						rs.getString("uname"), 
						rs.getString("uphoto")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return memberDTO;
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		MemberDAO dao = new MemberDAO();
		Connection conn = ConnectionProvider.getConnection();
		
		MemberDTO member = dao.selectByUidPw(conn, "cool", "1111");
		System.out.println(member); 
	}
	
	
	
}