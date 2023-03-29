package chapter06;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		// 배열의 선언.
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수.
		
		// 배열의 생성.
		scores = new int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스.
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		// 인스턴스변수.     초기화X.     타입별 기본값으로.     초기화.
		System.out.println("--------------------------");
		
		// 배열 요소의 참조.
		// 배열이름[index]
		// index => 0 ~ 갯수-1.
		// 요소의 갯수 => 배열변수.length.		
		scores[0] = 60;
		scores[1] = 75;
		scores[2] = 97;
		scores[3] = 55;
		scores[4] = 70;
		scores[5] = 94;
		scores[6] = 100;
		scores[7] = 84;
		scores[8] = 30;
		scores[9] = 49;
		//scores[10] = 60;  // 오류.
		
		// 총합.
		int sum = 0;
		// 평균값.
		float avg = 0.0f;
				
		//System.out.println(scores[9]);
		// index => 0~9
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
			// 합의 연산.
			sum = sum + scores[i];
		}
		
		avg = sum/(float)scores.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);		
	}	
}
