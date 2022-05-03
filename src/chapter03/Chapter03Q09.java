package chapter03;

import java.util.Scanner;

public class Chapter03Q09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수:");
		String num1 = scanner.next();
		System.out.print("두 번째 수:");
		String num2 = scanner.next();
		
		double frist =Double.parseDouble(num1);
		double second =Double.parseDouble(num2);
		
		String result = frist / second + ""; //double을 문자로 바꾸기
		
		String tOrF = (second > 0) ? result : ((second == 0 || second ==0.0) ? "무한대" : result);
		
		System.out.println("결과:" + tOrF);
		
		
		
	}
}
