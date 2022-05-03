package chapter03;
import java.util.Scanner;

public class Chapter03Q11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {  // 비교하는건 기본타입만 String(참조는 비교하려면 .equal를 사용해야함)
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않음");
		}
		
		
		
		
		
	}
}
