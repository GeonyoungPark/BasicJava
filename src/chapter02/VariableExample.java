package chapter02;
/*
변수타입 변수이름 = 변수값;
=기준으로 오른쪽에있는 값을 왼쪽에 있는 변수에 할당함
-변수명 규칙 
1.문자 혹은 $,_로 시작
2. 대소문자구별함
3.첫문자는 소문자 그다음단어는 첫단어 = 대문자 ex)maxSpeed,carBodyColor
4.길이제한x
5.자바예약어? 사용x
*/ 
public class VariableExample {
	public static void main(String[] args) {
		int a; //변수선언
		a = 1; //변수 초기화
		System.out.println(a);
		
		int b = 100;//변수 선언 및 초기화
		System.out.println(b);
		
		String name = "홍길동"; 
		
	}
}