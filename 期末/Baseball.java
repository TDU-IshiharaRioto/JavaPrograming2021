//21AJ013 РќМіЧ…Се

public class Baseball {
	public static String getCounter (int count, String mark) {
		String a = "";
		for (int i = 0; i < count; i++) {
			a = a + mark;
		}
		return a;
	}
	public static String getLine (String name, String counter) {
		String a = name + "_" + counter;
		return a;
	}
}