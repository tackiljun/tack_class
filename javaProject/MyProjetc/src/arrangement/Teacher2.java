package arrangement;

public class Teacher2 {

	public static void main(String[] args) {

		// Student 타입의 배열 생성 : 데이터 10개 저장 가능.
		Teacher_Student[] students = new Teacher_Student[10];
		students[0] = new Teacher_Student("son01", 100, 100, 10);
		students[1] = new Teacher_Student("son02", 90, 85, 20);
		students[2] = new Teacher_Student("son03", 80, 75, 30);
		students[3] = new Teacher_Student("son04", 70, 65, 40);
		students[4] = new Teacher_Student("son05", 60, 55, 50);
		students[5] = new Teacher_Student("son06", 50, 45, 60);
		students[6] = new Teacher_Student("son07", 40, 35, 70);
		students[7] = new Teacher_Student("son08", 30, 25, 80);
		students[8] = new Teacher_Student("son09", 20, 15, 90);
		students[9] = new Teacher_Student("son10", 10, 95, 100);

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=================================================");

		for (Teacher_Student student : students) {
			System.out.println(student);
		}

	}

}
