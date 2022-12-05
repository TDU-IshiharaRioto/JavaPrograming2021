// 21AJ013 石原遼大

import jp.tdu.util.RandomNumber;

public class Kuji {
	public static int getNumber () {
		int number = RandomNumber.nextInt (4);
		return number;
	}
	public static String getPrize (int number) {
		String prize = "";
		if (number == 0) {
			prize = "ストラップ";
		} else if (number == 1) {
			prize = "おかし";
		} else if (number == 2) {
			prize = "ぬいぐるみ";
		} else if (number == 3) {
			prize = "フィギュア";
		}
		return prize;
	}
}