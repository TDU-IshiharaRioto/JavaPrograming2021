public class A7_3 {
	public static void main (String[] args) {
		System.out.println (getWetherInformation (20));
		System.out.println (getWetherInformation (-9));
	}
	public static String getWetherInformation (int temperature) {
		String message = "";
		if (temperature < 0) {
			message = "�^�~���ł�(0����)";
		} else {
			message = "�^�~���ł͂���܂���";
		}
		return message;
	}
}