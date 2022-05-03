package chapter04;

import java.util.Scanner;

public class Exercise43_SwtichExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int basicPro = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int db = scanner.nextInt();
		System.out.print("화면구현: ");
		int ui = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int app = scanner.nextInt();
		System.out.print("머신러닝:");
		int ml = scanner.nextInt();
		
		int total = basicPro + db + ui + app + ml;
		int aver = total / 5 ;
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n" , aver);
		String grade = "";
		
//	switch (aver / 10) {
//	case : 10 case : 9 
//		grade = "A";
//		break;
//	case : 8 
//	grade = "B";
//	break;
//	case : 7 
//	grade = "C";
//	break;
//	case : 6 
//	grade = "D";
//	break;
//	
//	default:
//		grade = "F";
//		break;
//		}
	}
}
