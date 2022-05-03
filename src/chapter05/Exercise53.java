package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {

	public static void main(String[] args) {
		Random random = new Random();
		String[] str1 = { "가위", "바위", "보" };
		int aiIndex = random.nextInt(str1.length);
//		System.out.println(str1[aiIndex]);
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");
		System.out.print("게이머 : ");
		String gamer = scanner.next();
		System.out.print("AI: ");
		System.out.print(str1[aiIndex]);
		String result = "";

	

	if (gamer.equals(str1[0]) || gamer.equals(str1[1]) || gamer.equals(str1[2])) {
			
		if (gamer.equals(str1[aiIndex])){
			result = "비김";
		}else if (gamer.equals("가위") && str1[aiIndex].equals("바위") 
				|| gamer.equals("보") && str1[aiIndex].equals("가위")
				|| gamer.equals("바위") && str1[aiIndex].equals("보")){
			result = "AI 승리!";
		}else{
			result = "게이머 승리!";
		}
	
	
		System.out.println("\n결과: " + result);	

 
	}	else {
		System.out.println("\n잘못된입력");
	}
	
		}
}
