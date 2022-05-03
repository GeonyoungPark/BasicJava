package chapter04;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
 public static void main(String[] args) {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	boolean run = true;
	System.out.println("Up and Down Game (1~100)");
	int ranNum = random.nextInt(100)+1;
	int i = 0;
	while (true) {
		int scanNum = scanner.nextInt();
		if(scanNum > ranNum) {
			System.out.println("DOWN");
			i++;
		}if(scanNum < ranNum) {
			System.out.println("UP");
					i++;
		} if(scanNum == ranNum) {
			i++;
			System.out.println("정답입니다." + i + "번");
			break;
		}
	}
	
}
}
