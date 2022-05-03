package chapter06;

public class CalculatorExample {
	public static void main(String[] args) {
	/*		Calculator myCalculator = new Calculator();
		myCalculator.powerOn();
		 int result1 = myCalculator.plus(5,6);
		 System.out.println("result1 : " + result1);
		 byte x = 10;
		 byte y = 4;
		 double result2 = myCalculator.divide(x, y);
		 System.out.println("result2 : " + result2);
		 myCalculator.powerOff();
	
		myCalculator.execute();
	*/
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
