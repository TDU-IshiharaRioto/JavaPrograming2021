public class GradePoint {
	public static int getPoint (int score) {
		int point = 0;
		if (score >= 90) {
			point = 4;
		} else if ((score >= 80) && (score < 90)) {
			point = 3;
		} else if ((score >= 70) && (score < 80)) {
			point = 2;
		} else if ((score >= 60) && (score < 70)) {
			point = 1;
		} else if (score < 60) {
			point = 0;
		}
		return point;
	}
	public static String getGrade (int point) {
		String grade = "";
		if (point == 4) {
			grade = "S";
		} else if (point == 3) {
			grade = "A";
		} else if (point == 2) {
			grade = "B";
		} else if (point == 1) {
			grade = "C";
		} else if (point == 0) {
			grade = "D";
		}
		return grade;
	}
	public static boolean isSuccess (int score) {
		boolean success = false;
		if (score >= 60){
			success = true;
		}
		return success;
	}
	public static String getMessage (boolean success) {
		String message = "";
		if ( success ) {
			message = "‡Ši";
		} else {
			message = "•s‡Ši";
		}
		return message;
	}
}