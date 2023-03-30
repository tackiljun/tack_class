package chapter07;

public class ClassCasting1 {
	
	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("011-1111-2222");
		
		Phone phone = new AndroidPhone("11");
		Phone p = new IPhone("222");
		
		Phone phone1 = (Phone)androidPhone;
		Phone phone2 = androidPhone; // 하위타입의 참조변수를 상위타입으로 변경은 생략 가능 
		
		AndroidPhone phone3 = (AndroidPhone)phone;
		
		//AndroidPhone phone4 = (AndroidPhone)p; // new Iphone("222");
		
		IPhone iphone = null;
		AndroidPhone androidPhone2 = null;
		
		if(p instanceof IPhone) {
			iphone = (IPhone)p;
			iphone.call();
		} else if( p instanceof AndroidPhone ) {
			androidPhone2 = (AndroidPhone)p;
			androidPhone2.call();
		} 
		
		
		
		
	}

}
