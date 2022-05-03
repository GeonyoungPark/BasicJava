package chapter05;

import java.util.Random;

public class Exercise54 {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[] order = { 1, 2, 3, 4, 5, 6 };
		int[] addOrder = new int [6];
		
//		int first,second,third,fouth,fifth,sixth = 0;
		
		for (int i = 0; i < 10000; i++) {
		 int ranNum = random.nextInt(6) + 1;
		 switch (ranNum) {
		case 1:
			addOrder[0]++;
			break;
		case 2:
			addOrder[1]++;
			break;
		case 3:
			addOrder[2]++;
			break;
		case 4:
			addOrder[3]++;
			break;
		case 5:
			addOrder[4]++;
			break;
		case 6:
			addOrder[5]++;
			break;
	
		 	}		
		} 
		
//		addOrder[0] = first;
//		addOrder[1] = second;
//		addOrder[2] = third;
//		addOrder[3] = fourth;
//		addOrder[4] = fifth;
//		addOrder[5] = sixth;
		
		System.out.println("----------"); 
		System.out.println("면     빈도"); // "면\t빈도" 하면 더 깰끔
		System.out.println("----------"); 
		for (int i = 0; i < order.length; i++) {
			System.out.println(order[i] + "     " + addOrder[i]);
		}

	}

}
