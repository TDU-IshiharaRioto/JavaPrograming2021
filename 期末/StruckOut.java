//21AJ013 �Ό��ɑ�

import jp.tdu.util.KeyboardReader;
import jp.tdu.util.RandomNumber;

public class StruckOut {
	public static String getInputMessage () {
		return "�˂炤�ԍ��i1�`9�j����͂��Ă��������F";
	}
	public static int getNumber () {
		int i = KeyboardReader.readInt ();
		return i;
	}
	public static int throwBall () {
		int i = RandomNumber.nextInt (13);
		i = i - 1;
		return i;
	}
	public static String getMessage (int ball) {
		String message = "";
		if (ball <= 0) {
			message = "�͂��܂���ł���";
		} else if ((ball >= 1) && (ball <= 9)) {
			message = "�{�[����" + ball + "�Ԃɓ�����܂���";
		} else {
			message = "�͂���܂���";
		}
		return message;
	}
	public static String getResult (int ball, int number) {
		String message = "";
		if (ball == number) {
			message = "�˂�����ԍ��ɓ�����܂����@���߂łƂ�";
		} else {
			message = "�˂�����ԍ��ɓ�����܂���ł���";
		}
		return message;
	}
}