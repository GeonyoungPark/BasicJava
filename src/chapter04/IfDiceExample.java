package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
		Random random = new Random();
		
		int ranNum = random.nextInt(6) + 1;
		
		if(ranNum == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(ranNum == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(ranNum == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(ranNum == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(ranNum == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
