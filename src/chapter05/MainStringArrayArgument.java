package chapter05;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		//데이터를 외부에서 넣기 위해 main(String[] args)를 사용
		//argument 인수 값을 넣어준다.......
	    if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			return;
		}
	    String strNum1 = args[0];
	    String strNum2 = args[1];

	int num1 = Integer.parseInt(strNum1);
	int num2 = Integer.parseInt(strNum2);
	
	System.out.printf("%d + %d = %d",num1, num2, num1 + num2);
	}
}
