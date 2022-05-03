package chapter06;

public class NewCar {
	private double speed; // 현재속도 km/h w
	private String color;
	private static final double MAX_SPEED = 200 / 1.6;
//	private static final double MAX_SPEED = killoToMile(200);

	public NewCar() {

	}

	public NewCar(String color) {

		this.color = color;
	}

	private static double killoToMile(double distance) {
		double result = distance / 1.6;
		return result;

	}

	private static double mileToKillo(double distance) {
		double result = distance * 1.6;
		return result;
	}

	public double getSpeed() {
		 return mileToKillo(speed);
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) { // 매개변수가 killo 이거를ktm
		double kToM = killoToMile(speed);
	//	speed = killoToMile(speed);
		if (kToM == 0) {
			this.speed = 0;
			return false;
		} else if (kToM >= MAX_SPEED) {
			this.speed = this.speed;
			return true;
		} else {
			setSpeed(kToM + this.speed);
			return true;
		}
	}

	static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
}
