public class StruckOutMain {
	public static void main (String[] args) {
		System.out.println ("�X�g���b�N�A�E�g�Q�[��");
		System.out.print (StruckOut.getInputMessage ());
		int number = StruckOut.getNumber ();
		System.out.println (number + "�Ԃ��˂炢�܂�");
		System.out.println ("�{�[���𓊂��܂���");
		int ball = StruckOut.throwBall ();
		System.out.println ("�{�[���̈ʒu�F" + ball);
		System.out.println (StruckOut.getMessage (ball));
		System.out.println (StruckOut.getResult (ball, number));
	}
}