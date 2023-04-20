package quiz07;

public class Female extends Person {

	// 2. Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
	// ① 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	// ② 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	// ③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
	// ④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.

	String say;

	public Female(String name, String number) {
		super(name, number);
		// TODO Auto-generated constructor stub
		this.say = "안녕! ";
	}

	@Override
	public void showPrint() {
		// TODO Auto-generated method stub
		super.showPrint();
		System.out.println("요! ");
	}

}
