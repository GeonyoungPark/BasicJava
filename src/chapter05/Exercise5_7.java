package chapter05;

import java.util.Scanner;

public class Exercise5_7 {

	public static void main(String[] args) {
		int[] coinUnit = { 500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오");
		int scanMoney = scanner.nextInt();
		int myMoney = 0;
		
			for (int i = 0; i < coinUnit.length; i++) {
				myMoney += coinUnit[i] * coin[i];
			
		}
			if (scanMoney > myMoney) {
				System.out.println("거스름돈이 부족합니다.");
			} else {
				for (int i = 0; i < coin.length; i++) {   // 2100 / 500
					System.out.println(coinUnit[i] +"원" + scanMoney / coinUnit[i]);
					scanMoney -= coinUnit[i] * (scanMoney / coinUnit[i]);
					
				}
			
			}
			
	}

}
