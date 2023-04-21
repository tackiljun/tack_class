package contactCoding;

public class Contact0Main {

	public static void main(String[] args) {

		Contact0 c = new Contact0("탁일준", "010-7777-7777", "tack@gmail.com", "인천", "2023.03.28", "학원");

		System.out.println("이름 : " + c.getName());
		System.out.println("전화번호 : " + c.getPhoneNumber());
		System.out.println("이메일 : " + c.getEmail());
		System.out.println("주소 : " + c.getAddress());
		System.out.println("생일 : " + c.getBirthday());
		System.out.println("그룹 : " + c.getGroup());

		System.out.println();
		c.printData1();

		c.setPhoneNumber("010-1234-1234");
		c.setEmail("tack@naver.com");
		c.setAddress("서울");
		c.setBirthday("1923.03.08");

		System.out.println();
		c.printData1();

	}

}
