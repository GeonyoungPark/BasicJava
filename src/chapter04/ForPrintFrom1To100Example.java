package chapter04;

public class ForPrintFrom1To100Example {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		
	}
}
/* 몇번을 반복해야하는지 알때는 For문이 좋음
for (중괄호안에서 사용할 변수; 조건 i < args.length; 사용하는 변수에 숫자를 증감i++)
{			
~~~~~~~~~~~~~~~~~~~~~	
}

while(조건식) 몇번반복할지 모를때 while이 편함
{

}

do{
   실행문
} while(조건식); 
 
		 */