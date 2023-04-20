package member;

public class MemberMain2 {

	public static void main(String[] args) {
		//	
		// ④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
		

		
		
		Member member1 = new Member(
				"name",
				"phoneNumber",
				"major",
				"grade",
				"email",
				"birthday",
				"address"
				);
				
		member1.print();
		
		System.out.println("-----------------");
				
				
		Member member2 = new Member(
				"name",
				"phoneNumber",
				"major",
				"grade",
				"email",
				"birthday",
				"address"
				);
		member2.print(); 

	}

}
