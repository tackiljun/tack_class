package chapter05;

public class AdderMain {

	public static void main(String[] args) {

		Adder adder = new Adder();

		adder.add(10);
		System.out.println(adder.add(10, 20));
		System.out.println(adder.add(10.0f, 20.0f));
		// 매개변수의 타입이 다르거나 갯수가 다르면 같은 이름으로 사용이 가능하다.

	}

}
