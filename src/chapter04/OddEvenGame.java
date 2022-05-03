package chapter04;

import java.util.Random;
import java.util.Scanner;

public class OddEvenGame {
	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.print("홀짝을 입력하시오.(홀:0 | 짝:1)");
		Scanner scanner = new Scanner(System.in);
		int decisionNum = scanner.nextInt();
		int ranNum = random.nextInt(10) + 1;
		int even = ranNum % 2;
		if (even != decisionNum) {
			
			System.out.println("나온숫자" + ranNum + "\n정답입니다.");
			
		} else {
			System.out.println("나온숫자" + ranNum + "\n오답입니다.");
		}
		
		
	}
}
