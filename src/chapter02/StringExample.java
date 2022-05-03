package chapter02;
/*
  \"
 \r \n 줄바꿈   /n = 줄바꿈 /r = 캐리지리턴(맨 앞으로 가는것 타자기에서)
 \t 탭공간
 \ 다음엔 t r n " 이런애들만 봐야한다.
 (\알파벳u숫자)면 그에 해당하는 유니코드문자 나옴

*/
public class StringExample {
	public static void main(String[] args) {
		char c1 = 'A';
		String name = "홍길동";
		String job = "프로그래머"; 
		//String(참조타입,Reference Type)
		System.out.println(name);
		System.out.println("나의 \\이름은 \"" + name + "\"이고,\r나의 직업은 \"" + job + "\"다");
	}
}
