package chapter05;

import java.util.Random;

public class Noduplicates {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[2];
		
		for (int i = 0; i < arr.length; i++) {
		int ranNum	= random.nextInt(2) + 1;
		 arr[i] = ranNum;
		}
		System.out.println(arr + ",");
	}

}
