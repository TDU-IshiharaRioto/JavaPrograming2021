public class A7_2 {
	public static void main (String[] args) {
		printWeatherInformation (15);
		printWeatherInformation (-3);
	}
	public static void printWeatherInformation (int temperature) {
		String message = "";
		if (temperature < 0) {
			message = "^“~“ú‚Å‚·(0–¢–ž)";
		} else {
			message = "^“~“ú‚Å‚Í‚ ‚è‚Ü‚¹‚ñ";
		}
		System.out.println (message);
	}
}