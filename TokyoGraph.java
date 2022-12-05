public class TokyoGraph {
	public static void main (String[] args) {
		for (int i = 0; i < 12; i++) {
			int month = i + 1;
			int temp = Tokyo.getTemperature (month);
			String bar = Graph.makeBar ("*", temp);
			String s = String.format ("%3dŒŽ", month);
			System.out.println (s + bar);
		}
	}
}