public class A7_13 {
	public static void main (String[] args) {
		int score = 65;
		
		int point = GradePoint.getPoint (score);
		String grade = GradePoint.getGrade (point);
		boolean success = GradePoint.isSuccess (score);
		String message = GradePoint.getMessage (success);
		
		System.out.println ("スコア:" + score);
		System.out.println ("ポイント:" + point);
		System.out.println ("グレード:" + grade);
		System.out.println (message);
	}
}