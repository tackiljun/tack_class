package quiz;

public class Quiz06 {

	public static void main(String[] args) {

		// 문제 6. while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.

//		int num = 1;
//		
//		while (num < 100) {
//			int n = 0;
//			n+=num;
//			System.out.println(n + " + "+ num + " = " + n);
//			num++;
//		}
//		int i=1;
//		while(i<100) {
//			int sum =0;
//			sum+=i;
//			System.out.println(sum);
//			i++;
//		}

		int num = 1;
		int sum = 0; // 합을 저장하는 변수.

		while (num < 100) {
			// 반복 처리하는 문장 : 합을 구하는 연산.

			// sum = sum + num;
			sum += num;
			num++;
		}

		sum = 0;
		// int i;

		for (int i = 1; i < 100; i++) {
			// System.out.println(i);
			sum += i;
		}
		// System.out.println(i);

		System.out.println("1~99 까지의 합 : " + sum);

	}

}
