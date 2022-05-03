package chapter04;

public class Chapter04Q05 {
	public static void main(String[] args) {

       String stars = "";             
		for (int i = 1; i <= 4; i++) {
			
//			                   
			for (int j = 1; j <= i; j++) {
				stars += "*";
				
				}	
			stars += "\n";
			}		
		System.out.println(stars);
		}
	}

