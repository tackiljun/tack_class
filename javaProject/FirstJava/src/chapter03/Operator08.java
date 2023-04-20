package chapter03;

public class Operator08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = 'A';

		System.out.println(c++); // char 타입의 증감 연산은 char 타입을 유지 A 출력.
		System.out.println(c--); // ‘B’ 출력.

		System.out.println(c); // ‘A’ 출력.

		System.out.println(++c); // ‘B’ 출력.
		System.out.println(--c); // ‘A’ 출력.

	}

}
