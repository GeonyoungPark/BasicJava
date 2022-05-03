package chapter06;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	public Car() {
	}

	public Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
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

//	public boolean speedUp(double speed) { // 갈색에는 가속해야하는 속도
//		if (speed < 0 || speed > MAX_SPEED) {
//			this.speed = getSpeed();
//			return false;
//		} 
//		else {
//			setSpeed(speed + getSpeed());
//			return true;
//		}
//	}

	public boolean speedUp(double speed) { // 갈색에는 가속해야하는 속도
		if (this.speed + speed >= 0 && this.speed + speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		}
		return false;
	}

	static double getMaxSpeed() {
		return MAX_SPEED;
	}
}
