public class A7_1 {
	public static void main (String[] args) {
		printWeatherInformation (10) ;
		printWeatherInformation (-1) ;
	}
	public static void printWeatherInformation (int temperature) {
		String message = "�^�~���ł͂���܂���";
		if (temperature < 0) {
			message = "�^�~���ł�(0����)";
		}
		System.out.println (message);
		
	}
}