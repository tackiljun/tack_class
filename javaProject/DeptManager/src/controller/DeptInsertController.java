package controller;

import java.sql.SQLException;

import domain.Dept;
import main.DeptManagerMain;
import service.DeptInsertService;

public class DeptInsertController {
	
	DeptInsertService insertService;
	
	
	
	public DeptInsertController() {
		this.insertService = new DeptInsertService();
	}

	public void insertDept() {
		// 1. 사용자 입력 처리 -> Dept 타입의 객체를 반환.
		Dept dept = inputDept();
		// 2. Dept 객체를 Service 로 전달 = 결과 반환(1 or 0).
		int result = 0;
		try {
			result = insertService.insertDept(dept);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3.결과를 출력.
		printData(result);
	}
	
	private void printData(int result) {
		if(result>0) {
			System.out.println("입력되었습니다.");
		} else {
			System.out.println("입력실패.(입력값을 확인 후 다시 입력해주세요).");
		}
	}
	
	// 사용자 입력처리 화면(VIEW)
	private Dept inputDept() {
		
		System.out.println("부서정보 입력을 시작합니다.");
		System.out.println("부서번호를 입력하세요.>>");
		int deptno = Integer.parseInt(DeptManagerMain.sc.nextLine());
		System.out.println("부서이름을 입력하세요.>>>");
		String dname = DeptManagerMain.sc.nextLine();
		System.out.println("부서위치를 입력하세요.>>>");
		String loc = DeptManagerMain.sc.nextLine();
		
		return new Dept(deptno, dname, loc);
	}

}
