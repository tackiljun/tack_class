package chapter03;

public class Operator14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short snum1 = 20;
		short snum2 = 30;
		
		snum1 += snum2;
		
		// snum1 += snum2;  // snum1 = snum1 + snum2
		
		// snum1 = snum1 + snum2
				
		System.out.println(snum1);

		
		System.out.println();
		
		
		int num = 10;
		
		num += 5;  // num = num = 5  =>  num = 10 + 5 => 15.
		System.out.println(num);  // 15.
		
		num -= 5;  // num = num - 5  =>  num = 10 - 5 => 10.
		System.out.println(num);  // 10.
		
		num *= 2;  // num = num * 2  =>  num = 10 * 2 => 20.
		System.out.println(num);
		
		num /= 2;  // num = num / 2  =>  num = 20 / 2 => 10.
		System.out.println(num);
		
		num %= 3;  // num = num % 3  =>  num = 10 % 3 => 1.
		System.out.println(num);

	}

}
