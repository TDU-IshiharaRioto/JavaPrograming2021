//21AJ013 �Ό��ɑ�

public class ChibaMain {
	public static void main (String[] args) {
		for (int i = 0; i < 12; i++) {
			int month = i + 1;
			int temperature = Chiba.getTemperature (month);
			System.out.println (month + "��" + temperature + "�x");
		}
	}
}