package chapter04;

import java.util.Random;

public class BreakExample {
	public static void main(String[] args) {
		Random random = new Random();
		
		while (true) { //true 항상 옳다 = 무한반복
			int ranNum = random.nextInt(6) + 1;
			System.out.println(ranNum);
			if (ranNum == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
