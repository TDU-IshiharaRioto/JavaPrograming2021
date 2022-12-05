public class Tokyo {
	public static int getTemperature (int month) {
		int temp[] = {7,8,11,13,20,23,24,29,24,18,14,8};
		month = month - 1;
		return temp[month];
	}
}