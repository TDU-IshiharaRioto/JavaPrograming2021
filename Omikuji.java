//21AJ013 �Ό��ɑ�

import jp.tdu.util.RandomNumber;

public class Omikuji {
	public static String getWelcomeMessage (String name) {
		String message = name + "����̍����̉^����";
		return message;
	}
	public static String getMessage (int number) {
		String[] u = {"��g", "���g", "���g", "�g", "���g", "��", "�勥"};
		return u[number];
	}
	public static String getRandomMessage () {
		int no = RandomNumber.nextInt (7);
		return Omikuji.getMessage (no) + "�ł�";
	}
	public static void consult (String name) {
		System.out.print (Omikuji.getWelcomeMessage (name));
		System.out.println (Omikuji.getRandomMessage ());
	}
}