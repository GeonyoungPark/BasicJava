package backjoon;

public class PlusCycle {
	public static void main(String[] args) {
		String stringNum = "26";
		int intNum;
		int first;
		int second;
		int secondTemp;
		int resultSecondTemp;
		int temp = 0;
		intNum = Integer.parseInt(stringNum);
		first = intNum/10; //2
		second = intNum%10; //6
		
		intNum = first + second;
		stringNum = "" + second + intNum;
		System.out.println(stringNum); //68
		intNum = Integer.parseInt(stringNum);
		first = intNum/10; //6
		second = intNum%10; //8
		intNum = first + second;
		
	    temp = intNum;
	    System.out.println(temp);
	    secondTemp = intNum%10; //4
	    System.out.println(secondTemp);
	    stringNum = "" + second + secondTemp;
		System.out.println(stringNum);
		intNum = Integer.parseInt(stringNum);
		first = intNum/10; //8
		second = intNum%10; //4
		intNum = first + second; //12
		
		
		temp = intNum;
		secondTemp = intNum%10; //2
		System.out.println(secondTemp);
		stringNum = "" + second + secondTemp;
		intNum = Integer.parseInt(stringNum);
		System.out.println(intNum);
		first = intNum/10; //4
		second = intNum%10; //2
		intNum = first+second;
		secondTemp = intNum%10;
		stringNum = "" + second + secondTemp;
		System.out.println(stringNum);
		
		
	}
}
