// 21AJ013 �Ό��ɑ�

import jp.tdu.util.RandomNumber;

public class Medal {
	public static int getNumber () {
		int n = RandomNumber.nextInt (3);
		return n = n +1;
	}
	public static String getName (int number) {
		String name = "";
		if (number == 1) {
			name = "��";
		} else if (number == 2) {
			name = "��";
		} else if (number == 3) {
			name = "��";
		}
		return name;
	}
	public static int getScore (int number) {
		number = number * 5;
		return number;
	}
}