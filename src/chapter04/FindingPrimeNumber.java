package chapter04;

import java.util.Scanner;

public class FindingPrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소수찾기 숫자를 입력하세요");
		
		while (true) {
			int scanNum = scanner.nextInt();
			if(scanNum%1 == 0 && scanNum%scanNum == 0) {
				System.out.println("소수입니다.");
			}
		}
	}
}
