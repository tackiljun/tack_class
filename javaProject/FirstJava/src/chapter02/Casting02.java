package chapter02;

public class Casting02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 10;
		int i = (int) b;
		// 큰쪽으로 갈때는 뒤에(int) 생략가능.
		System.out.println("i = " + i);
		System.out.println("b = " + b);

		int i2 = 300;
		byte b2 = (byte) i2;
		// 작은쪽으로 가는 형변환때는 주의! 뒤 (byte) 생략X.
		System.out.println("i2 = " + i2);
		System.out.println("b2 = " + b2);

	}

}
