package chapter03;

public class Operator13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;

		boolean result = false;

		// result = (num1 += 10); // num1 =+10 => num1 = num1+10 과 같다.

		// &&은 앞에 false가 나오면 뒤는 볼 필요없음.
		result = (num1 += 10) < 0 && (num2 += 10) > 0;

		System.out.println(result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);

		// ||은 앞에 true가 나오면 뒤는 볼 필요없음.
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		System.out.println(result);
		System.out.println("num1 : " + num1 + ", num2 :" + num2);

	}

}
