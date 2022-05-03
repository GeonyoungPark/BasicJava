package backjoon;

import java.util.Scanner;

public class PlusCycleFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intNum;
		int first;
		int second;
		int secondTemp;
		String zeroNum = "0";
		int count = 0;
		System.out.println("숫자를입력하시오");
		String originalNum = scanner.nextLine();
		String stringNum = originalNum;
		boolean a = Integer.parseInt(originalNum) <= 9;
		if(a) {
			stringNum = "" +zeroNum + originalNum;
			while (true) {

				 intNum = Integer.parseInt(stringNum);
				 first = intNum/10; //2
				 second = intNum%10; //6
				 intNum = first + second;
				 secondTemp = intNum%10;
				 stringNum = "" + second + secondTemp;
				 count++;
				 if(originalNum.equals(secondTemp)) {
					 a = false;
					 
				   }
				
				}
		} else {
			while (true) {

				 intNum = Integer.parseInt(stringNum);
				 first = intNum/10; //2
				 second = intNum%10; //6
				 intNum = first + second;
				 secondTemp = intNum%10;
				 stringNum = "" + second + secondTemp;
				 count++;
				 if(stringNum.equals(originalNum)) {
					 break;
					 
				   }
				
				}
			
		}
		
		
		System.out.println(count);
		}
		
	}


