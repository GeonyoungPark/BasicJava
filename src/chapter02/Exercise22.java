package chapter02;

public class Exercise22 {
	public static void main(String[] args) {
		
		double distance = 40e12;
		int speed = 300_000; // 숫자에 _ 를 쓰면 구분용으로 사용됨 컴마대신
		double lightYears = (distance / speed) / 31_536_000;
	    
		
		System.out.printf("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 %.15f광년이다." , lightYears);
		
	}
}
