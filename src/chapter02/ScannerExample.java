package chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	/*
	 * 이름: 감자바
	 * 나이" 25
	 * 전화: 010-123-4567
	 */
	String name = "감자바";
    int age = 25;
    String tel1 = "010";
    String tel2 = "123";
    String tel3 = "4567";

    System.out.println("이름: " + name);
    System.out.print("나이: " + age);
    System.out.printf("\n전화: %s-%s-%s", tel1, tel2, tel3);
    
      System.out.print("첫번째 수: ");
      String strnum1 = scanner.next();
      
      System.out.println("두번째 수: ");
      String strnum2 = scanner.next();
      
      int num1 = Integer.parseInt(strnum1);
      int num2 = Integer.parseInt(strnum2);
      int result = num1 + num2;
      System.out.println("덧셈결과:" + result);
      
    
      System.out.println("[필수 정보 입력]");
      System.out.println("1. 이름: ");
      String name1 = scanner.next();
      
      System.out.println("2. 주민번호 앞 6자리: ");
      int dateOfBirth = scanner.nextInt();
      
      System.out.println("3. 전화번호: ");
      String telNum = scanner.next();
     
      
      
      System.out.println("\n[입력한 내용]");
      System.out.printf("%s", name1);
      System.out.printf("\n%d",dateOfBirth);
      System.out.printf("\n%s",telNum);
    		
}
}
