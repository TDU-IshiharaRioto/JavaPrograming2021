import jp.tdu.util.TextFileReader;
public class A12_3 {
	public static void main (String[] args) {
		System.out.println (args[0] + "�t�@�C�����Ђ炫�܂�");
		TextFileReader reader = new TextFileReader (args[0]);
		if (reader.open ()) {
			System.out.println ("�t�@�C�����J���܂���");
			int i = 1;
			while (reader.ready ()) {
				System.out.print (i + ":");
				System.out.println (reader.readLine ());
				i++;
			}
			reader.close ();
		} else {
			System.out.println ("�t�@�C�����J���܂���");
		}
	}
}