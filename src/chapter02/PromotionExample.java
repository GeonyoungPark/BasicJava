package chapter02;
//작은 타입의 데이터를 큰 타입의 데이터로 옮이는건 쉽다.
public class PromotionExample {
	public static void main(String[] args) {
		long l = 50000000000L;
	//	int i = l; error 
	//	double d = l; ok
		
		int i = 200;
		byte b = (byte) i;
		System.out.println(b); //범위에서 순환한다 0 -> 127갔다가 다시 밑으로내려가 -56나온다.
	
		double dd = 3.14;
		int ii = (int) dd;
		System.out.println(ii);
		
		byte x = 10;
		byte y = 20;
		// byte result = x + y; error 
		int result = x + y;
		
		
	
	}
	
}
