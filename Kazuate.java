import jp.tdu.util.KeyboardReader;
import jp.tdu.util.RandomNumber;

public class Kazuate {
	public static String getResultMessage(int player, int computer) {
		String message = "";
		if (player > computer) {
			message = "���͒l���傫���ł�";
		} else if (player < computer) {
			message = "���͒l���������ł�";
		} else {
			message = "�����ł�";
		}
		return message;
	}
	public static void play () {
		System.out.print ("0�ȏ�A2�ȉ�����͂��Ă��������B");
		int player = KeyboardReader.readInt ();
		if ((player < 0) || (player > 2)) {
			System.out.println ("���͂��ꂽ�l���Ԉ���Ă��܂�");
			return ;
		}
		int computer = RandomNumber.nextInt (3);
		System.out.println ("�v�Z�@�F" + computer);
		System.out.println (Kazuate.getResultMessage (player, computer));
	}
}