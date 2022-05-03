package chapter05;

public class Exercise51 {
	public static void main(String[] args) {
		int arr[] = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = 0;
		int min;
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
	
		min = max;
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
