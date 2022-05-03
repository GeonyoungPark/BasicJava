package chapter05;

import java.util.Random;

//랜덤한 숫자 1~10  10개를 arr배열에 넣고 나오는 숫자만큼 옆에다 별을찍자
//ex) 5*****
//    1*  이게 10개
public class randomStar {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random random = new Random();
		
		//랜덤숫자 10개를 arr배열에 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10)+1;
			
		}
		// arr의 길이 10개만큼 숫자를 가로로 만든다 
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
			//숫자하고 줄바꿈하기전 arr의 숫자만큼 * 찍고 arr숫자랑 같아지면 false for문끝나고 줄바꿈
			for (int i = 0; i < arr[j]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
