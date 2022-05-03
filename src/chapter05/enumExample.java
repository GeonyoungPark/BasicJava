package chapter05;

import java.time.DayOfWeek;
import java.util.Calendar;

public class enumExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch (week) {
		case 1:
			today = Week.일;
			break;
		case 2:
			today = Week.월;
			break;
		case 3:
			today = Week.화;
			break;
		case 4:
			today = Week.수;
			break;
		case 5:
			today = Week.목;
			break;
		case 6:
			today = Week.금;
			break;
		case 7:
			today = Week.토;
			break;
	
		
		}
		System.out.println("오늘의 요일은: " + today + "요일");
	}
}
