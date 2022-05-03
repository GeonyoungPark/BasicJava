package chapter03;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		// index = index +1; 이란 코드가 반복된다면 간단하기 하기 위해
		//이렇게 만듬 index += 1;   해석은 위에 코드로 해석
	}
}
/*
 * 증감연산자 index += 1;를 줄이기위해 사용 무조건1씩증감
 * index += 1; 1일때만 가능
 * index++; 로 줄임 혹은 ++index; 도 가능 
 * main메소드와 변수가 저장되는 공간이 다름
 * 차이점은 ++index;는 저장되는 공간에서 1를 증가시키고 main메소드(cpu,캐시)에서 실행
 * index++ 변수가 저장되는 공간(stack)에서 숫자를 가져와 main메소드에서 1증가
 *  
 *  
 *  int i = 0; 
 *  int j = 1;
 *  int k = ++i;
 *  int l = i++;
 *  i = 2 j = 1 k = 1 l = 1 이됨
 *  
 *  k = i++ + ++j;
 *  4 = 2 + 2 이고 스택에있는 i 는 3으로 증가
 *  
 *  i++ 뒤에붙이는 걸 더 많이 사용함
 */
