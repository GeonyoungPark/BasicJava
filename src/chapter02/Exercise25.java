package chapter02;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원의 갯수를 입력하시오: ");
		int five = scanner.nextInt();
		
		System.out.print("100원의 갯수를 입력하시오: ");
		int hundred = scanner.nextInt();
		
		System.out.print("50원의 갯수를 입력하시오: ");
		int fifty = scanner.nextInt();
		
		System.out.print("10원의 갯수를 입력하시오: ");
		int ten = scanner.nextInt();
	
		int fiveTotal = 500 * five;
		int hundredTotal = 100 * hundred;
		int fiftyTotal = 50 * fifty;
		int tenTotal = 10 * ten;
		int total = fiveTotal + hundredTotal + fiftyTotal + tenTotal;
		
		System.out.printf("저금통 안의 동전의 총 액수: " + total);
	}
}
