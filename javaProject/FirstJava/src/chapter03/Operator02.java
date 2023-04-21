package chapter03;

public class Operator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean led = true;

		System.out.println(led);
		System.out.println(!led);
		System.out.println(led);

		int num1 = 5;
		int num2 = 13;

		// System.out.println("num1 > num2" + num1 > num2);
		// The operator > is undefined for the argument type(s) String, int
		System.out.println("num1 > num2 => " + (num1 > num2));
		System.out.println("!(num1 > num2) => " + (num1 > num2));
		System.out.println("!(num1 > num2) => " + !(num1 > num2));

	}

}
