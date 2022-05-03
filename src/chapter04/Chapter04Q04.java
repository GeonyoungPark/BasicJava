package chapter04;

public class Chapter04Q04 {
	public static void main(String[] args) {
		
		for (int x = 1; x <= 10; x++) {
		 
			for (int y = 1; y <= 10; y++) {
				
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("" + x +","+ y + "는 해입니다" );
					
				}
				
			}
			
		}			
	}
}
