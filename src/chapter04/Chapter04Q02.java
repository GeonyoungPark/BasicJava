package chapter04;

public class Chapter04Q02 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("3배수의 합 : " + sum);
	}
}
