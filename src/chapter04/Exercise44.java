package chapter04;
//시험문제임
import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");
		System.out.print("철수 : ");
		String chulsoo = scanner.next();
		System.out.print("영희: ");
		String younghee = scanner.next();
		String result = "";
		
	
		
		if (chulsoo.equals(younghee)){
			result = "비김";
		}else if (chulsoo.equals("가위") && younghee.equals("바위") 
				|| chulsoo.equals("보") && younghee.equals("가위")
				|| chulsoo.equals("바위") && younghee.equals("보")){
			result = "영희 승리!";
		}else{
			result = "철수 승리!";
		}
		
		System.out.println("결과: " + result);
	}
}
