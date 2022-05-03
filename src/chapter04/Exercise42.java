package chapter04;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//println은 안쓰면 안쓸수록 좋음 현장에서...........
		System.out.print("월을 입력하세요(1~12): ");
		int month = scanner.nextInt();
		
		String result = "";
		
		switch (month) {
		case 1: case 2: case 12:
			result = "겨울";
			break;
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:		
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못된 입력입니다.");
			break;
		}
	//	System.out.println(month + "월은" + result + "입니다.");
		System.out.printf("%d월은 %s입니다.", month, result); //이런식으로 쓰는게 요즘 트렌드
		
	}
}
