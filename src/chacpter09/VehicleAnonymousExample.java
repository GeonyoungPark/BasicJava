package chacpter09;

public class VehicleAnonymousExample {
	public static void main(String[] args) {
		VehicleAnonymous anonym = new VehicleAnonymous();
		anonym.field.run();
		anonym.method1();
		anonym.method2(new Vehicle() {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}

		});
	}
}
