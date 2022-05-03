package chapter03;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		
		x++; //10 스택에있는 x는 11
		++x; //스택에있는 x 는 12로 증가시키고 캐시로 가져옴 12
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		y--; //10 이고 스택에있는 y는 9
		--y; // 스택에있는 y를 8로 감소시키고 캐시로 가져옴 8
		System.out.println("y=" + y);
		
		System.out.println("---------------");
		z = x++; //캐시엔 12 스택엔 13으로 증감
		System.out.println("z:" + z); //12
		System.out.println("x=" + x); //13
		
		System.out.println("---------------");
		z = ++x; // 스택엔 z =13이 들어있고 스택에서 1증감 14를 캐시로 가져옴
		System.out.println("z:" + z); //14
		System.out.println("x=" + x); //14
	
		System.out.println("---------------");
		z = ++x + y++; //스택에 있는 x는 15 
		               //y는 8인 상황에서 캐시로 가져온뒤 스택엔9로 바뀜 
		               //z는 15 + 8 =23
		System.out.println("z:" + z); //23
		System.out.println("x:" + x); //15
		System.out.println("y:" + y); //9
		
		
		/*삼항 연산자 (조건연산자)
		(조건식) ? (true일때값) : (false일때값)
		캐릭터타입의 문자를 대입함...
		*/
		
	}
}
