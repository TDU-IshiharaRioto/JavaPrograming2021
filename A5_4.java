public class A5_4 {
	public static void main (String[] args) {
		int a = 3;
		paint (a);
		paint (a + 1);
	}
	public static void paint (int number) {
		for (int i = 0; i < number; i++) {
			System.out.print ("*");
		}
		System.out.println ();
	}
}