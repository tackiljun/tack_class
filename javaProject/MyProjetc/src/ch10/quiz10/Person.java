package ch10.quiz10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {

		// 1. 콘솔에서 사용자 아이디를 입력 받아
		// 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지
		// 확인하는 프로그램을 만들어봅시다.

		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요. ");
		String id = sc.nextLine();

		try {
			for (int i = 0; i < id.length(); i++) {
				char c = id.charAt(i);
				if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')) {
					BadInputException e = new BadInputException("사용할수 없는 아이디입니다. ");
					throw e;
				}
			}
		} catch (BadInputException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------");

		// 2. Scanner 클래스로 태어난 년도를 입력 받을 때
		// int 타입으로 받도록 합시다.
		// 이때 nextInt() 메소드를 사용하게 되는데 이때
		// 발생하는 예외처리를 하도록 합시다.
		Scanner sc2 = new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요. ");

		try {
			
			int year = sc2.nextInt(); //2000
			
			if(year<0) {  //음수 제외시키기.
				System.out.println("양수만 입력하세요. ");
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요. ");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다. ");
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램을 종료합니다. ");

	}

}
