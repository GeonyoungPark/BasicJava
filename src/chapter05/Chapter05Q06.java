package chapter05;

import java.util.Scanner;

public class Chapter05Q06 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null; //몇개가 들어가는지 모를때 null로 쓰고 밑에서 스캐너로 선
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		double avg = 0;
		while (run) {
			System.out.println("-------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				System.out.print("scores[0]> ");
				int scoreOne = Integer.parseInt(scanner.nextLine());
				scores[0] = scoreOne;
				System.out.print("scores[1]> ");
				int scoreTwo = Integer.parseInt(scanner.nextLine());
				scores[1] = scoreTwo;
				System.out.print("scores[0]> ");
				int scoreThree = Integer.parseInt(scanner.nextLine());
				scores[2] = scoreThree;
				
			} else if (selectNo == 3) {
			System.out.println("scores[0]: " + scores[0]);
			System.out.println("scores[1]: " + scores[1]);
			System.out.println("scores[2]: " + scores[2]);
			
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {

					if (max < scores[i]) {
						max = scores[i];
					} 
				}
				System.out.println("최고점수: " + max);
				for (int k = 0; k < scores.length; k++) {
					sum += scores[k];
					avg =  (double) sum / studentNum;
				}
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
			  run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
