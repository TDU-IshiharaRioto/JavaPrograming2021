public class A7_11 {
	public static void main (String[] args) {
		boolean ice = false;
		System.out.println (getState (ice));
		ice = true;
		System.out.println (getState (ice));
	}
	public static String getState (boolean ice) {
		String message = "";
		if (ice) {
			message = "氷です";
		} else {
			message = "水です";
		}
		
		return message;
	}
}