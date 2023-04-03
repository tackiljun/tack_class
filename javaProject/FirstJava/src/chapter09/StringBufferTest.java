package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		// append.
		//sb.append('~'); // 이전 Hello 뒤에 ~ 가 붙어서 "Hello~" 가 만들어진다.
		//sb.append(" JAVA"); // 이전 Hello~ 뒤에 JAVA 가 붙어서 "Hello~ JAVA" 가 만들어진다.
		
		// 다른 방법.
		System.out.println("-------------------");
		
		sb.append('~').append(" JAVA"); // 참조값.append(" JAVA").append(true) => 체이닝.
		System.out.println(sb); // 앞 방법과 같이 "Hello~ JAVA" 가 만들어진다.
		
		System.out.println("-------------------");
		
		// delete.
		sb.delete(5, 7); // 5~(7-1)
		System.out.println(sb); // HelloJAVA.
		
		System.out.println("-------------------");
		
		// insert
		sb.insert(5, '~');
		System.out.println(sb); // Hello~ JAVA.
		sb.insert(6, "~! ");
		System.out.println(sb); // Hello~~! JAVA.
		sb.insert(sb.length(), false);
		System.out.println(sb); // Hello~~! JAVAfalse.
		
		System.out.println("-------------------");
		
		// reverse.
		sb.reverse();
		System.out.println(sb); // eslafAVAJ !~~olleH.
		
		System.out.println("-------------------");
		
		// result.
		String result = new String(sb);
		
		System.out.println(result);
		
		
		
		
		
	}

}
