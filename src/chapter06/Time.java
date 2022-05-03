package chapter06;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {

	}

	public Time(int hour, int minute, int second) {
		this.hour = hour; //parameter로 전달된걸 필드값으로 대입
		this.minute = minute;
		this.second = second;
		
//		if (hour >= 0 && hour <= 23) {
//			this.hour = hour;
//		} else {
//			hour = 0; //조건에 맞지않으면 어쩌피 0으로 초기화
//		}
//		if (minute >= 0 && minute <= 59) {
//			this.minute = minute;
//		} else {
//			this.minute = 0;
//		}
//		if (second < 0 || second >= 59) { 일부러 바꿈 공부할려고
//			this.second = 0;
//		} else {
//			this.second = second;
//		}

		
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		else {
			this.hour = 0;
		}
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		else {
			this.minute = 0;
		}
		if (minute >= 0 && minute <= 59) {
			this.second = second;
		} 
		else {
			this.second = 0;
		}
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}
