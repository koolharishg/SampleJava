package Practice;

public class ReverseInteger {

	public static void main(String[] args) {

		int i = 1221;
		int rev = 0;
		int j = 1221;
		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
		}

		System.out.println(rev);

		if (j == rev) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}
	}

}
