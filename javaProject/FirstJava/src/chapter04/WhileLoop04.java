package chapter04;

public class WhileLoop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~10 출력.
		int num = 0;
		
		while(num<10) {
			
			num++;
			
			if(num%2==0) {
				continue;
			}
			
			System.out.println(num);
			
			//num += 2; // num = num + 2;
			
		}

	}

}






