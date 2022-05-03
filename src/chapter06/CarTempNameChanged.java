package chapter06;

//클래스 선언 정보를 담고있는 설계도

//선언
public class CarTempNameChanged {
	String company = "현대자동차";
	String model;
	String color;
	int speed;
	int maxSpeed;
	boolean engineStart;
	CarTempNameChanged(){
		
	}
	CarTempNameChanged(String model){
		this(model, "은색", 250);
	}
	CarTempNameChanged(String model, String color){
	    this(model, color, 250);
		
	}
	CarTempNameChanged(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		//this는 인스턴스인 객체를 뜻함
	}
	int getSpeed() {
		return speed;
	}
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		
		}
	}
}
