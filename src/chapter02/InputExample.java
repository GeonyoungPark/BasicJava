package chapter02;

import java.util.Scanner; //다른 클래스를 참조한다

public class InputExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 사용자가 입력한 데이터를 받고 싶을때 Scanner 클래스를 생성
		// = 기준 오른쪽에 있는게 먼저실행 후 왼쪽 변수에 넣음
		// Quick fix (control + 1)
		scanner.nextLine(); //문자입력받기(엔터치는 부분까지)
		scanner.next(); // 문자입력받기 (공백 또는 엔터입력된 부분까지)
		scanner.nextInt(); //정수입력받기
		scanner.nextDouble();//실수 입력받기
		*/
		System.out.println("이름을 입력하세요: ");
		String name = scanner.next(); //next()안에 입력된 문자열이name에 저장
		
		System.out.println("나이를 입력하세요: ");
		int age = scanner.nextInt();
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "입니다.");
		
		System.out.printf("당신의 이름은 %s이고 나이는 %d입니다.", name, age);
		System.out.printf("잔액 : %0,10d\n", 1000000); 
		// ,는 자동으로 ,찍어줌 d 앞에 숫자는 10칸만 사용하겠다, %위에0은 빈공간 0으로 채움
	
		System.out.printf("잔액: %.2f\n", 10.12905);
		System.out.printf("%s-%s-%s", "010", "1234","5678");
	}
}
