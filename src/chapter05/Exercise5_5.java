package chapter05;

import java.util.Random;

public class Exercise5_5 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		int tempNum =0;
		boolean f = false;
		int l=0;
		Random random = new Random();
	//                  1
		for (int i = 0; i < ball3.length; i++) {
			tempNum= random.nextInt(9);
			if (i==0) {
				ball3[i] = tempNum;
			}else{	
				for(int j=0; j<=i; j++) {
					if (tempNum==ball3[j]) {
						f=false;
						break;
					}else {
						f=true;
					}
				}
				l=i;
				if (f) {
					ball3[l] = tempNum;
				}else {
					i=0;
				}
				
			}
			//ball3[i] = random.nextInt(9);
		}	
//			               0     1
/*		for (int j = 0; j < i; j++) {
//                         0            1
				if(ballArr[j] == ballArr[j+1]) {
					i = 0; // 같으면 i에 1을 빼서 비교for문을 중지한다음 
					break;			
			}
		}
	}*/
		
		for (int k = 0; k < ball3.length; k++) {
			System.out.print(ball3[k]);
		}
	}
}
