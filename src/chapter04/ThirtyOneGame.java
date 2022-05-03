package chapter04;

import java.util.Scanner;

public class ThirtyOneGame {
	public static void main(String[] args) {
		System.out.println("31게임");
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		while (true) {
			
		    int scanNum = scanner.nextInt();
		    sum = scanNum;
		    if(sum == 31) {
		    	System.out.println("패배");
		    	break;
		    }
		}
	}
}
