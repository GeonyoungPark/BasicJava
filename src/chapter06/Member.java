package chapter06;

public class Member {
	String name;
	String id;
	String password;
	int age;
	//기본생성자 매개변수가 없는거(parameter)
	public Member() {
		
	}//             매개변수
	public Member(String n, int a) {
		name = n;
		age = a;
	}
}
