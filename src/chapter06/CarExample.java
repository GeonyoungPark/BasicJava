package chapter06;
//
//메모리에있는애들이 인스턴스?
//클래스 정보를 담을수잇는 속성 / 동작을 할수있는 메소드 (필드와 메소드)
public class CarExample {
	public static void main(String[] args) {
		CarTempNameChanged myCar = new CarTempNameChanged();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");
	/*	Car carSample1 = new Car();
		System.out.println(carSample1.company);
		System.out.println(carSample1.model);
		System.out.println(carSample1.speed);
		System.out.println(carSample1.engineStart);
		Car carSample2 = new Car();
		System.out.println(carSample1.company);
		System.out.println(carSample1.model);
		System.out.println(carSample1.speed);
		System.out.println(carSample1.engineStart);
		
		carSample2.speed = 100;
		carSample2.engineStart = true;
		System.out.println(carSample2.company);
		System.out.println(carSample2.model);
		System.out.println(carSample2.speed);
		System.out.println(carSample2.engineStart);
		
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	*/
	}
}
