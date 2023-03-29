package arrangement;

public class StudentMain {

	public static void main(String[] args) {
		
		// 3. main()메소드에 아래 내용을 정의해봅시다. 
		// ① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		// ② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		// ③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		
		Student[] cs = new Student[10];
		

		cs[0] = new Student("탁일준", 100, 100, 100);
		cs[1] = new Student("존존스", 90, 90, 90);
		cs[2] = new Student("은가누", 85, 85, 85);
		cs[3] = new Student("송수정", 100, 100, 100);
		cs[4] = new Student("한동민", 75, 75, 75);
		cs[5] = new Student("이정후", 80, 80, 80);
		cs[6] = new Student("홍길동", 70, 70, 70);
		cs[7] = new Student("허준", 99, 99, 99);
		cs[8] = new Student("이순신", 100, 100, 100);
		cs[9] = new Student("유재석", 5, 5, 5);
	}

}
