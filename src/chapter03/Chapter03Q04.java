package chapter03;

public class Chapter03Q04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한명이 가지는 연필 개수
		int pencilsPerStudents = pencils / students;
		System.out.println(pencilsPerStudents);
		
		//남은연필
		int pencilsLeft = pencils - pencilsPerStudents * students;
		System.out.println(pencilsLeft);
		
	}
}
