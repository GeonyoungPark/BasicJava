package chapter02;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//input
		System.out.print("원기둥 밑변의 반지름을 입력하시오. (단위: cm)");
		double radius = scanner.nextDouble();
		
		System.out.print("원기둥의 높이을 입력하시오. (단위: cm)");
		double height = scanner.nextDouble();
		
		//data processing
		
		double area = Math.PI * radius * radius; 
		double volume = area * height;
		
		//output
		System.out.printf("윈기둥 밑변의 넓이는 %.14fcm²이고, 윈기둥의 부피는 %.13fcm²이다.",
		area , volume);
	}
}
