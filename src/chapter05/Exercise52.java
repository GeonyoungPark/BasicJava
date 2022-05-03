package chapter05;


import java.util.Random;

public class Exercise52 {
public static void main(String[] args) {
	Random random = new Random();
	
	int[] arr = new int[6];
	
	//  6번까지 램던숫자생성 for 문
	for (int i = 0; i < arr.length; i++) {
		arr[i] = random.nextInt(45) + 1;
//생성 i번째와 j~i까지 하나씩 비교하는 for문   
		for (int j = 0; j < i; j++) {
		
	//  비교 if문   0       
			if(arr[j] == arr[i]) {
				i--; // 같으면 i에 1을 빼서 비교for문을 중지한다음 
				break;//생성포문에서 i번째에 숫자를 다시 넣음 
			}//그다음 중복된 번째의 숫자를 생성for문에서 다시 넣음
		}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}

