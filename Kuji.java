// 21AJ013 �Ό��ɑ�

import jp.tdu.util.RandomNumber;

public class Kuji {
	public static int getNumber () {
		int number = RandomNumber.nextInt (4);
		return number;
	}
	public static String getPrize (int number) {
		String prize = "";
		if (number == 0) {
			prize = "�X�g���b�v";
		} else if (number == 1) {
			prize = "������";
		} else if (number == 2) {
			prize = "�ʂ������";
		} else if (number == 3) {
			prize = "�t�B�M���A";
		}
		return prize;
	}
}