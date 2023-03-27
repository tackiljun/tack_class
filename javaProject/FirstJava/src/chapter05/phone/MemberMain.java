package chapter05.phone;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member1 = new Member("존존스", "JON@gmail.com", 20, "010-1111-8888");
		Member member2 = new Member("박지성", "PARK@gmail.com");
		
		member1.showData();
		System.out.println();
		member2.showData();
		

	}

}
