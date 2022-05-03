package chapter04;

import java.util.Scanner;

public class Chapter04Q07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		int deposit = 1;
		int withdrawl = 2;
		int checkBalance = 3;
		int exit = 4;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			String decision = scanner.nextLine();
			int parseDecision = Integer.parseInt(decision);
			
			if(parseDecision == deposit) {
				System.out.print("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
			}if(parseDecision == withdrawl) {
				System.out.print("예금액>");
				balance -= Integer.parseInt(scanner.nextLine());
			}if(parseDecision == checkBalance) {
				System.out.print("예금액>" + balance);
			
			} if(parseDecision == exit) {
				run = false;
			} 
			System.out.println();
			}
		
	System.out.println("프로그램 종료");	
	}
}
