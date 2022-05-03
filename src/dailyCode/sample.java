package dailyCode;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가격 입력하시오");
		double valueOfSupply = scanner.nextDouble();
		
		double vat = (valueOfSupply / 100) * 10;
		double total = valueOfSupply + vat;
		
		double expense = (valueOfSupply / 100) * 30;
		double income = valueOfSupply - expense;
		double dvidend1 = (income / 100) * 50;
		double dvidend2 = (income / 100) * 30;
		double dvidend3 = (income / 100) * 20;
		System.out.println("세금" + vat);
		System.out.println("총합" + total);
		System.out.println("비용" +expense);
		System.out.println("이익" + income);
		System.out.println("배당1 : " + dvidend1);
		System.out.println("배당2 : " + dvidend2);
		System.out.println("배당3 : " + dvidend3);
		
		
	}

}
