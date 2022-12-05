import jp.tdu.util.TextFileReader;
public class A12_3 {
	public static void main (String[] args) {
		System.out.println (args[0] + "ファイルをひらきます");
		TextFileReader reader = new TextFileReader (args[0]);
		if (reader.open ()) {
			System.out.println ("ファイルが開けました");
			int i = 1;
			while (reader.ready ()) {
				System.out.print (i + ":");
				System.out.println (reader.readLine ());
				i++;
			}
			reader.close ();
		} else {
			System.out.println ("ファイルが開けません");
		}
	}
}