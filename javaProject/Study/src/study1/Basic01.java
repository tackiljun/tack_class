package study1;

import java.util.Scanner;

public class Basic01 {

	public static void main(String[] args) {
		
		// n=1 일 때  “현재 인원은 1명 입니다.”
		// n=2 일 때  “현재 인원은 2명 입니다.”
		// n=3 일 때  “현재 인원은 3명 입니다.”
		// n>3 일 때  “현재 많은 사람들이 있습니다.”
		// If 문으로 작성해주세요!
	
		Scanner sc = new Scanner(System.in);
	    int n;
		n = 5;  
		
		
		if (n==1) {
			System.out.println("현재 인원은 1명 입니다. ");
		} else if (n==2) {
			System.out.println("현재 인원은 2명 입니다. ");
		} else if (n==3) {
			System.out.println("현재 인원은 3명 입니다. ");
		} else {
			System.out.println("현재 많은 사람들이 있습니다. ");
		}
	}
}