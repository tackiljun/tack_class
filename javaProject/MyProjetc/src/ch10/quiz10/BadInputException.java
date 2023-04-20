package ch10.quiz10;

public class BadInputException extends Exception {

	// ① 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
	// ② 예외 클래스 이름은 BadIdInputException이라고 정의합시다.

	public BadInputException(String message) {
		super(message);
	}

}
