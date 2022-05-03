package chapter05;

public class Chapter05Q04 {

	public static void main(String[] args) {
		int max = 0; //0 1 2 3 4
		int[] array = {11,13,5,75,31};
		int min;
		
		for (int i = 0; i < array.length; i++) {
        
			if (array[i] > max) {
				max = array[i];
			} 
		}
		
		min = max;
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] < min ) {
				
				min = array[j];
			} 
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
	}

}
