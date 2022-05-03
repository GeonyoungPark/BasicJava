package chapter04;

import java.util.Scanner;

public class Exercise43 {
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
		double aver = (double) total / 5.0;
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n" , aver);
		
		String grade = "";
		
		if (aver >= 90) {
			grade = "A";
		} else if (aver >= 80) {
			System.out.print("학점: B");
		} else if (aver >= 70) {
			System.out.print("학점: C");
		} else if (aver >= 60) {
			System.out.print("학점: D");
		} else {
			System.out.print("학점: F");
		} 
		System.out.printf("학점: %s", grade);
	}
}
