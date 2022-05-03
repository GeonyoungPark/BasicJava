package chapter06;

public class Circle {
	private double radius;
	private double x;
	private double y;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

//	public void setRadius(double radius) {
//		if (radius < 0) {
//			this.radius = 0;
//		}
//		this.radius = radius;
//	}
	public void setRadius(double radius) {
		if (radius > 0) {   //생성자가 생성될때 0으로 초기화되기 때문에 0보다 클때만 동작
			this.radius = radius;
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}

}
