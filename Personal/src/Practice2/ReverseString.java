package Practice2;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Vibhish";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("reverse of string is-->" + rev);

	}

}
