// 21AJ013 石原遼大

public class Kujibiki {
	public static void main (String[] args) {
		int number = Kuji.getNumber ();
		System.out.println ("くじの番号：" + number);
		String prize = Kuji.getPrize (number);
		System.out.println (prize + "が当たりました");
	}
}