public class A9_6 {
	public static void main (String[] args) {
		int[] scores = {90, 80, 60, 50};
		for (int i = 0; i < scores.length; i++) {
			scores[ i ] = scores[ i ] + 10;
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println (scores[ i ]);
		}
		
		//for (int i = 0; i < scores.length; i++) {
		//	scores[ i ] = scores[ i ] + 10;
		//	System.out.println (scores[ i ]);
		//}
	}
}