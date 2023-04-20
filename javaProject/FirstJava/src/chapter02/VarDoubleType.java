package chapter02;

public class VarDoubleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 실수를 저장할 수 있는 타입 : float, double.
		// float num1 = 1.23456789;
		// Type mismatch: cannot convert from double to float
		float num1 = 1.23456789f;

		System.out.println(num1);

		double num2 = 1.23456789123456789;
		System.out.println("1.23456789123456789");
		System.out.println(num2);

		float height1 = 180.5f;
		System.out.println(height1);

		double height2 = 180.5;
		System.out.println(height2);

	}

}
