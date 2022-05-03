package chapter04;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//옛날방식         추출할 숫자 갯수 =  마지막숫자 - 처음숫자 + 1
		//(int) (Math.random() * (추출할 숫자 갯수)) + 처음 숫자;
		
		//앞으로는 이걸로 쓰세요.
		Random random = new Random(80);
		//int ranNum = random.nextInt(6)+1;  //6은 0~부터 5 까지
		//random.nextInt(15) + 11;  //11~부터 25 까지
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
	}
}
