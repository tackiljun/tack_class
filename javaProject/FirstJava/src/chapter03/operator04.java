package chapter03;

public class operator04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		System.out.println("num1 : " + num1);
		
		int num2 = num1++; // 대입 연산 후 num1의 값을 1 증가시킴
		System.out.println("num2 : " + num2);
		System.out.println("num1 : " + num1);
		
		System.out.println("num1++ : " + num1++);
		System.out.println("++num1 : " + ++num1);
		System.out.println("++num1 : " + num1++);
		System.out.println("num1 : " + num1);
		// ++num 이나 num++ 이나 같다.
		// 다른거랑 같이 쓸때는 다르게...
		

	}

}
