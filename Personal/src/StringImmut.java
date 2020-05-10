
public class StringImmut {

	public static void main(String[] args) {

		String s1 = "java";

		StringBuffer sbf = new StringBuffer(s1);
		sbf.append(" python");
		System.out.println(sbf);

		// String Buffer is thread safe. Synchronized

		// string builder is not thread safe
		// no synchronization

		StringBuilder sbd = new StringBuilder(s1);
		sbd.append(" python");
		System.out.println(sbd);

	}

}
