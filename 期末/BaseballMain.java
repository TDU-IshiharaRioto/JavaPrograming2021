//21AJ013 ÎŒ´—É‘å

public class BaseballMain {
	public static void main (String[] args) {
		String counter1 = Baseball.getCounter (3, "b");
		String counter2 = Baseball.getCounter (2, "s");
		String counter3 = Baseball.getCounter (2, "o");
		String line1 = Baseball.getLine ("B", counter1);
		String line2 = Baseball.getLine ("S", counter2);
		String line3 = Baseball.getLine ("O", counter3);
		System.out.println (line1);
		System.out.println (line2);
		System.out.println (line3);
	}
}