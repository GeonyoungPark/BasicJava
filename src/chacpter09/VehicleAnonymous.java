package chacpter09;

import chapter08.Vehicle;

public class VehicleAnonymous {

	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
			
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
			
		};
				
		localVar.run();
	}
	void method2(chacpter09.Vehicle vehicle) {
		vehicle.run();
	}
}
