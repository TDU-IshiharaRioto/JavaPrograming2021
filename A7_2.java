public class A7_2 {
	public static void main (String[] args) {
		printWeatherInformation (15);
		printWeatherInformation (-3);
	}
	public static void printWeatherInformation (int temperature) {
		String message = "";
		if (temperature < 0) {
			message = "�^�~���ł�(0����)";
		} else {
			message = "�^�~���ł͂���܂���";
		}
		System.out.println (message);
	}
}