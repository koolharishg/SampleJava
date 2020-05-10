
public class reverseString {

	public static void main(String[] args) {

		// using loog

		String s = "bazinga";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println("reverse of string is ->" + rev);

		// using String Buffer
		StringBuffer sbf = new StringBuffer(rev);
		System.out.println(sbf.reverse());
	}

}
