package quiz;

public class Quiz04 {

	public static void main(String[] args) {

		// 문제 4. SwitchBreak.java를 switch문이 아닌,
		// if~else를 사용하는 형태로 변경해 보자.
		/*
		 * int n=3; switch(n) { case 1: System.out.println("Simple Java"); break; case
		 * 2: System.out.println("Funny Java"); break; case 3:
		 * System.out.println("Fantastic Java"); break; default:
		 * System.out.println("The best programming language"); }
		 * System.out.println("Do you like coffee?");
		 */

		/*
		 * int n=3; if (n==1) { System.out.println("Simple Java"); } else if (n==2) {
		 * System.out.println("Funny Java"); } else if (n==3) {
		 * System.out.println("Fantastic Java"); } else {
		 * System.out.println("The best programming language"); }
		 * System.out.println("Do you like coffee?");
		 */

//		int key = 3;
//		switch(key) {
//		case 1: // key == 1.
//			System.out.println("AAA");
//			break;
//		case 2: // key == 2.
//			System.out.println("BBB");
//			break;
//		case 3: // key == 3
//			System.out.println("CCC");
//			break;
//	    default : // else
//	    	System.out.println("DDD");
//		}

		int key = 3;
		if (key == 1) {
			System.out.println("AAA");
		} else if (key == 2) {
			System.out.println("BBB");
		} else if (key == 3) {
			System.out.println("CCC");
		} else {
			System.out.println("DDD");
		}

		System.out.println("프로그램을 종료합니다.");

	}

}
