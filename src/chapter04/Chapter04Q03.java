package chapter04;

import java.util.Random;

public class Chapter04Q03 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		while (true) {
			int ranNum1 = random.nextInt(6) + 1;
			int ranNum2 = random.nextInt(6) + 1;
			System.out.println("(" + ranNum1 + "," + ranNum2 + ")");
			if (ranNum1 + ranNum2 == 5) {
				break;
			}
			
		}
		System.out.println("눈의 합이 5 입니다.");
	}
	
}
