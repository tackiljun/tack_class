package chapter02;

public class PrintTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "손흥민";
		
		
		// 안녕하세요! 저는 000입니다. 나이는 00살 입니다.
		System.out.print("안녕하세요! 저는 ");
		System.out.print(name);
		System.out.print("입니다.");
		
		System.out.println();
		
		System.out.printf("안녕하세요! 저는 %s입니다. 나이는 %d살 입니다. " , name, 20);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		

	// 안녕하세요. 저는 JAVA입니다. 저는 20살입니다. 
	// 정수 : 10 , 실수 : 13.5.
	// System.out.printf("정수 : 10, 실수 : 13.5", 10, 13.5);
	// 문자 : Z , 문자열 : KING.
	//System.out.printf("문자 : Z, 문자열 : KING", 'z', "KING");
	System.out.printf("안녕하세요. 저는 %s입니다.", "JAVA");
	System.out.println();
	System.out.printf("저는 %d살 입니다" , 20);
	System.out.println();
	System.out.printf("정수 : %d , 실수 : %f" , 10 , 13.5);
	System.out.println();
	System.out.printf("문자 : %c , 문자열 : %s" , 'Z' , "KING");
	}
	
	

}
