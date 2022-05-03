package chapter03;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요:");
			int scanNum1 = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요:");
			int scanNum2 = scanner.nextInt();
			
			int compareNum1 = ((scanNum1 + scanNum2) + Math.abs(scanNum1 - scanNum2)) / 2;
			int compareNum2 = ((scanNum1 + scanNum2) - Math.abs(scanNum1 - scanNum2)) / 2;
		
			int quotient = compareNum1 / compareNum2;
			int remainder = compareNum1 % compareNum2;
		System.out.println("큰 수를 작은 수로 나는 몫은 " + quotient + "이고,"
				+ "\n나머지는 " + remainder + "이다");
	}
}
