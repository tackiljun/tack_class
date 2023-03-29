package chapter06;

public class Member {
	
	int memberNo;
	String memberId;
	String memberName;
	
	public Member(int memberNo, String memberId, String memberName) {
		// super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "회원 [회원번호=" + memberNo + ", 아이디=" + memberId + ", 이름=" + memberName + "]";
	}
	
	
	
}
