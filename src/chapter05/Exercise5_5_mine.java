package chapter05;

import java.util.Random;

public class Exercise5_5_mine {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		Random random = new Random();
// 생성
		for (int i = 0; i < ball3.length; i++) {
			ball3[i] = random.nextInt(9);
		

			for (int j = 0; j < i; j++) {
                //                  
				if(ball3[j] == ball3[i]) {
					i = 0; // 같으면 i에 1을 빼서 비교for문을 중지한다음 
					 break;			
				}
			}
		}
		
		
		for (int k = 0; k < ball3.length; k++) {
			System.out.print(ball3[k]);
		}
	}
}
