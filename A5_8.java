public class A5_8 {
	public static void main (String[] args) {
		for (int i = 0; i < 4; i++) {
			paint (i + 1, "*");
		}
	}
	public static void paint (int number , String message) {
		for (int i = 0; i < number; i++) {
			System.out.print (message);
		}
		System.out.println ();
	}
}