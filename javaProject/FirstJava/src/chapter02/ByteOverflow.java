package chapter02;

public class ByteOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다루어야 하는 데이터의 범위에 따라서 타입설정이 달라져야한다.
		// 0~270.
		byte b = 0;
		int i = 0;
		
		// 0 에서 1씩 더해서 270까지 증가시키는 코드.
		// for(초기식; 비교식; 증감식) { 반복해야 하는 코드들 }
		for(int x=0; x <= 270; x++) {
			// System.out.println(x);
			
			// b = b + 1;
			
			System.out.println(b + "\t" + i);
			// 문자열 + Any type => 문자열.
			b++; // ++b; 도 가능.
			i++;
		}

	}

}
