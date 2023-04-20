package chapter02;

public class Casting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 100.0;

		System.out.println("d = " + d);

		int i = 100;

		int result = i + (int) d;
		int result2 = (int) (i + d);
		// i=int , d=double.
		// int + double => double + double => double.

		System.out.println("d = " + d);
		System.out.println("i = " + i);
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);

	}

}
