package chapter04;

public class SwitchCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자에게 권한 : 
		// 일반유저 : 읽기.
		// 매니저 : 읽기, 쓰기.
		// 관리자 : 읽기, 쓰기, 삭제.
		
		String grade = "user"; // admin , manager , user.
		
		switch (grade) {
		case "admin" :
			System.out.println("삭제 기능 사용 가능.");
		case "manager" :
			System.out.println("쓰기 기능 사용 가능.");
		case "user" :
			System.out.println("읽기 기능 사용 가능.");
		}

	}

}
