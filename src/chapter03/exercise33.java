package chapter03;

import java.util.Scanner;

public class exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년인지를 확인할 연도를 입력하세요:");
		int leapYear = scanner.nextInt();
		
		int four = leapYear % 4;
		int hundred = leapYear % 100;
		int fourHundred = leapYear % 400;
		String yes = leapYear + "년은 윤년이 맞습니다.";
		String no = leapYear + "년은 윤년이 아닙니다.";
		
		String compare = ((four == 0 && !(hundred == 0)) || fourHundred == 0) ? yes : no;
		System.out.println(compare);
	}
}
