//package backjoon;
//
//import java.util.Scanner;
//
//public class PlusCycleForUnderZero {
//
//	public static void main(String[] args) {
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		int intNum;
//		int first;
//		int second;
//		int secondTemp;
//		String zeroNum = "0";
//		int count = 0;
//		System.out.println("숫자를입력하시오");
//		String originalNum = scanner.nextLine();
//		String stringNum = originalNum;
//		boolean a = Integer.parseInt(originalNum) <= 9;
//		
//		
//			while (true) {
//				if(Integer.parseInt(originalNum) == 1) {
//					count++;
//					break;
//				} else if(a) {
//				 intNum = Integer.parseInt(stringNum);
//				 first = intNum/10;
//				 second = intNum%10; 
//				 intNum = first + second;
//				 secondTemp = intNum%10;
//				 stringNum = "" + second + secondTemp;
//				 count++;
//				 
//				 if(Integer.parseInt(originalNum) == secondTemp) {
//					 a = false;
//					 break;
//				   }
//				
//				}
//	
//			
//		
//		
//		
//		System.out.println(count);
//		}
//		
//	}


