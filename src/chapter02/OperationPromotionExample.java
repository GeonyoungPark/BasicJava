package chapter02;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
	 // byte bytevalue3 = byteValue1 + byteValue2; error int타입으로 변환되서 계산
	    int intValue1 = byteValue1 + byteValue2;
	    System.out.println(intValue1);
	 // byte byteValue3 = (byte)byteValue1 + byteValue2;
	 // System.out.println(byteValue3);
	    
	    char charValue1 = 'A';
	    char charValue2 = 1;
	 // char charvalue3 = charValue1 + charValue2;
	    int intValue2 = charValue1 + charValue2;
	    System.out.println("유니코드=" + intValue2);
	    System.out.println("출력문자=" + (char)intValue2);
	    
	    
	    int intValue3 = 10;
	    int intValue4 = intValue3/4;
	    System.out.println(intValue4);
	    
	    
	    int intValue5 = 10;
	  //int intValue6 = 10 / 4.0;
	    double doubleValue = intValue5 / 4.0;
	    System.out.println(doubleValue);
	    
	    
	    int x = 1;
	    int y = 2;
	    double result = (double) x / y;
	    System.out.println(result);
	    
	    char c1 = 'a';
	    char c2 = (char) (c1 + 1);
	    System.out.println(c2);
	    
	    int x1 = 5;
	    int y1 = 2;
	    double result1212 = (double) x1 / y1;
	    System.out.println(result1212);
	   
	    
	    
	    
	}
}