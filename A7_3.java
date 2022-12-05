public class A7_3 {
	public static void main (String[] args) {
		System.out.println (getWetherInformation (20));
		System.out.println (getWetherInformation (-9));
	}
	public static String getWetherInformation (int temperature) {
		String message = "";
		if (temperature < 0) {
			message = "^“~“ú‚Å‚·(0–¢–ž)";
		} else {
			message = "^“~“ú‚Å‚Í‚ ‚è‚Ü‚¹‚ñ";
		}
		return message;
	}
}