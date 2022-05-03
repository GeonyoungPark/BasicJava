package chapter04;

import java.util.Random;
import java.util.Scanner;
//탐색문제 
public class Exercise45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int ranNum = random.nextInt(100) + 1;
		int i = 0;
		while (true) {
			
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하시오.");
			int scanNum = scanner.nextInt();
			i++;
			
			if (scanNum > ranNum) {
				System.out.println("정답은 더 작은 수입니다.");
			}else if (scanNum < ranNum) {
				System.out.println("정답은 더 큰 수입니다.");
			} else {
				System.out.println("정답입니다.");
				break;
			} 	
		}
		System.out.println("게임을 종료합니다." + i + "번");
	}
}
