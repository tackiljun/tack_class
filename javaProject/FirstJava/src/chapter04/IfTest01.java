package chapter04;

public class IfTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시험점수가 60점 이상일 때. => 조건식.
		// "PASS"를 출력하는 프로그램을 만들기. => 조건의 결과가 참일 때 처리.

		int score; // 시험점수 데이터.

		score = 91;

		if (score >= 60) {
			System.out.println("PASS");
		}

	}
}