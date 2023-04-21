package chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}

	public static void main(String[] args) {

		MyInterfaceImpl<String, Integer> my = null; // 메소드 안에서 my 는 지역변수.
		// my = new MyInterfaceImpl<String, Integer>();
		my = new MyInterfaceImpl(); // 위에서 썼기때문에 <S--, I--> 부분은 생략 가능.

		System.out.println(my.method1("TEN"));
		System.out.println(my.method2(10));

	}

}
