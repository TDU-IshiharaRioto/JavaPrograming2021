// 21AJ013 ÎŒ´—É‘å

import jp.tdu.util.RandomNumber;

public class Medal {
	public static int getNumber () {
		int n = RandomNumber.nextInt (3);
		return n = n +1;
	}
	public static String getName (int number) {
		String name = "";
		if (number == 1) {
			name = "“º";
		} else if (number == 2) {
			name = "‹â";
		} else if (number == 3) {
			name = "‹à";
		}
		return name;
	}
	public static int getScore (int number) {
		number = number * 5;
		return number;
	}
}