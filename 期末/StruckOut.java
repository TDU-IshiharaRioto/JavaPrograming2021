//21AJ013 石原遼大

import jp.tdu.util.KeyboardReader;
import jp.tdu.util.RandomNumber;

public class StruckOut {
	public static String getInputMessage () {
		return "ねらう番号（1～9）を入力してください：";
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
			message = "届きませんでした";
		} else if ((ball >= 1) && (ball <= 9)) {
			message = "ボールは" + ball + "番に当たりました";
		} else {
			message = "はずれました";
		}
		return message;
	}
	public static String getResult (int ball, int number) {
		String message = "";
		if (ball == number) {
			message = "ねらった番号に当たりました　おめでとう";
		} else {
			message = "ねらった番号に当たりませんでした";
		}
		return message;
	}
}