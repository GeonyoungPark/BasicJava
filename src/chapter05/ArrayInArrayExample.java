package chapter05;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="
						+ mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="
						+ englishScores[i][k]);
			}
		}
		System.out.println();
	//                        (0,0)(0,1) (1,0)(1,1)(1,2)                     
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		//              0     2
		for (int i = 0; i < javaScores.length; i++) {
		//	                 0    2 //0번째는 2 1번째는 3
			for (int k = 0; k < javaScores[i].length; k++) {
				
				System.out.println("javaScores["+i+"]["+k+"]="
						+ javaScores[i][k]);
			//                       0   0
			
			
			}
		}
	}
	
	

}
