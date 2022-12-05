public class StruckOutMain {
	public static void main (String[] args) {
		System.out.println ("ストラックアウトゲーム");
		System.out.print (StruckOut.getInputMessage ());
		int number = StruckOut.getNumber ();
		System.out.println (number + "番をねらいます");
		System.out.println ("ボールを投げました");
		int ball = StruckOut.throwBall ();
		System.out.println ("ボールの位置：" + ball);
		System.out.println (StruckOut.getMessage (ball));
		System.out.println (StruckOut.getResult (ball, number));
	}
}