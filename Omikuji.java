//21AJ013 ÎŒ´—É‘å

import jp.tdu.util.RandomNumber;

public class Omikuji {
	public static String getWelcomeMessage (String name) {
		String message = name + "‚³‚ñ‚Ì¡“ú‚Ì‰^¨‚Í";
		return message;
	}
	public static String getMessage (int number) {
		String[] u = {"‘å‹g", "’†‹g", "¬‹g", "‹g", "––‹g", "‹¥", "‘å‹¥"};
		return u[number];
	}
	public static String getRandomMessage () {
		int no = RandomNumber.nextInt (7);
		return Omikuji.getMessage (no) + "‚Å‚·";
	}
	public static void consult (String name) {
		System.out.print (Omikuji.getWelcomeMessage (name));
		System.out.println (Omikuji.getRandomMessage ());
	}
}