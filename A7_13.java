public class A7_13 {
	public static void main (String[] args) {
		int score = 65;
		
		int point = GradePoint.getPoint (score);
		String grade = GradePoint.getGrade (point);
		boolean success = GradePoint.isSuccess (score);
		String message = GradePoint.getMessage (success);
		
		System.out.println ("�X�R�A:" + score);
		System.out.println ("�|�C���g:" + point);
		System.out.println ("�O���[�h:" + grade);
		System.out.println (message);
	}
}