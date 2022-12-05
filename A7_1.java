public class A7_1 {
	public static void main (String[] args) {
		printWeatherInformation (10) ;
		printWeatherInformation (-1) ;
	}
	public static void printWeatherInformation (int temperature) {
		String message = "ê^ì~ì˙Ç≈ÇÕÇ†ÇËÇ‹ÇπÇÒ";
		if (temperature < 0) {
			message = "ê^ì~ì˙Ç≈Ç∑(0ñ¢ñû)";
		}
		System.out.println (message);
		
	}
}