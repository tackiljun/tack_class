package chapter04;

public class WhileLoop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;

		while (true) {

			// 탈출 조건.
			if (num == 5) {
				break;
			}

			System.out.println(num++);
		}

	}

}
