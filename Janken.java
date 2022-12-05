import jp.tdu.util.RandomNumber;

public class Janken {
	public static String getHandSign (int number) {
		String[] handsign = {"�O�[", "�`���L", "�p�["};
		return handsign [number];
	}
	public static void printIntroduction () {
		for (int i = 0; i < 3; i++) {
			System.out.println (Janken.getHandSign(i) + ":" +i);
		}
	}
	public static void printInputMessage () {
		System.out.print ("�W�����P���̔ԍ�����͂��Ă��������F");
	}
	public static void printResultMessage (int player, int computer) {
		int gu = 0;
		int cyoki = 1;
		int pa = 2;
		String message = "";
		if (player == computer) {
			message = "������";
		} else if ((player == gu) && (computer == cyoki)) {
			message = "�l�Ԃ̏���";
		} else if ((player == gu) && (computer == pa)) {
			message = "�v�Z�@�̏���";
		} else if ((player == cyoki) && (computer == gu)) {
			message = "�v�Z�@�̏���";
		} else if ((player == cyoki) && (computer == pa)) {
			message = "�l�Ԃ̏���";
		} else if ((player == pa) && (computer == gu)) {
			message = "�l�Ԃ̏���";
		} else if ((player == pa) && (computer == cyoki)) {
			message = "�v�Z�@�̏���";
		}
		System.out.println (message);
	}
	public static void pon (int player) {
		//System.out.println (player);
		if ((player >= 0) && (player <= 2)) {
			System.out.println ("�l�ԁF" + Janken.getHandSign (player));
			int computer = RandomNumber.nextInt (3);
			System.out.println ("�v�Z�@�F" + Janken.getHandSign(computer));
			Janken.printResultMessage (player, computer);
		} else {
			System.out.println ("0�ȏ�A2�ȉ�����͂��Ă�������");
		}
	}
}