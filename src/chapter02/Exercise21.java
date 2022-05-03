package chapter02;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	//input
	System.out.print("가로의 길이는? (단위: m): ");
	double width = scanner.nextDouble();
	System.out.print("세로의 길이는? (단위: m): ");
	double height = scanner.nextDouble();
	//data processing
	double area = height * width;
	double perimeter = (height + width) * 2;
	//output
//	System.out.println("\n가로의 길이는? (단위: m): " + width);
//	System.out.println("세로의 길이는? (단위: m): " + height);
	System.out.println("직사각형의 넓이: " + area);
	System.out.println("직사각형의 둘레: " + perimeter);
	
	}
}
