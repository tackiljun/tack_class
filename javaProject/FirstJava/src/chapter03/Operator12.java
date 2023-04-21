package chapter03;

public class Operator12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		int num2 = 2;

		// &&는 (true && true) 둘 다 true일때만 true.
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println(num1 > 10 && num2 < 50);

		System.out.println();
		// ||는 (false || false) 둘 다 false일때만 false.
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);

	}

}
