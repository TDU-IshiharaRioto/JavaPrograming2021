import jp.tdu.util.RandomNumber;

public class A10_3 {
	public static void main (String[] args) {
		int computer = RandomNumber.nextInt (3);
		System.out.println ("計算機の手の番号" + computer);
		String computerHand = Janken.getHandSign (computer);
		System.out.println ("計算機：" + computerHand);
	}
}