package chapter05;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Exercise52_answer {
public static void main(String[] args) {
	Random random = new Random();
	
	int[] arr = new int[6];
	
//	6번 반복
	for (int k = 0; k < arr.length; k++) {
//	
		arr[k] = random.nextInt(45) + 1;
//		
		for (int i = 0; i < k; i++) {
//			
			if(arr[i] == arr[k]) {
//				
				arr[k] = random.nextInt(45) + 1;
			}
		}
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + ",");
		}
	}
}

