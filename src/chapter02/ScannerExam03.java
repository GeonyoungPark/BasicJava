package chapter02;

import java.util.Scanner;

public class ScannerExam03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	    
		System.out.println("[필수입력정보]");
		System.out.println("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리");
		String ssn = scanner.nextLine();
		
		System.out.println("3. 전화번호");
		String tel = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("1.이름: " + name);
		
		
	}
}
