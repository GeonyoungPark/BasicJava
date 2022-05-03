package chapter05;

public class ReferenceExample {
	public static void main(String[] args) {
		//스캐너로 받은 문자열도 원래 원칙방식(new String)대로 처리해서
		//String pool에 저장됨
		
		
		
		//String pool String객체이니 heap에 저장됨
		//
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		//원칙 원래는 이렇게 써야하는데 String을 많이쓰니 
		// 위와같이 기본타입형식으로 쓸수있게함 
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		
		System.out.println(name1.equals(name2));
		System.out.println(name1 == name2);
		System.out.println(name3.equals(name4));
		System.out.println(name3 == name4);
		
		
	}
}
