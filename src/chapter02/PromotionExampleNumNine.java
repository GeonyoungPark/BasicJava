package chapter02;

public class PromotionExampleNumNine {
	public static void main(String[] args) {
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int) (var1 + var2 + var3 + (int) Double.parseDouble(var4));
		System.out.println(result);
		
		double var5 = 3.5;
		double var6 = 2.7;
		int result1 = (int) (var5 + var6);
		System.out.println(result1);
		
		String str1 = 2 + 3 + ""; //5
		String str2 = 2 + "" + 3; //23
		String str3 = "" + 2 + 3; //23
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}
}
