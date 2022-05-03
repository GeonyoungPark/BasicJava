package chapter03;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		    // true      and    true = true
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자군요");
		}
		   // false       and     true = false
		if((charCode>=97) && (charCode<=122)){
			System.out.println("소문자군요");
		}
		   // true        and    false  = false
		if(!(charCode<48) && !(charCode>57))  {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		   // true     or  true  =  true
		if(value%2==0 | (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		 // true      or   true =   true
		if(value%2==0 || (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
	}
}
