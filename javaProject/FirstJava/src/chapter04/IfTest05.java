package chapter04;

public class IfTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if구문 내부에 또 다른 if구문이 중첩해서 사용이 가능.
		
		// 양수, 음수, 0을 판별하는 프로그램.
		int number = 10;
		
		if (number > 0) {
			System.out.println("양수");
			if (number%2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
		} 
			else {
			if (number < 0 ) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
		}

	}

}
