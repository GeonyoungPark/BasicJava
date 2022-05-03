package chapter04;
//숫자를 다섯번 입력받고 입력받을 때마다 더해지는 식을 작성해보자.
import java.util.Scanner;

public class internetForExampleQ04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자를 입력하시오.");
			int scanNum = scanner.nextInt();
			sum += scanNum;
			System.out.println("출력:" + sum);
			
		}
	}
}
