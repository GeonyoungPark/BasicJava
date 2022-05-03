package chapter06;

public class Car2 {
	 int speed;
	 
	 void run() {
		 System.out.println(speed + "으로 달립니다.");
		 
	 }
	 public static void main(String[] args) {
		Car2 car2 = new Car2();
		car2.speed = 60;
		car2.run();
	}
}
