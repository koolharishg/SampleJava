
public class SwapString {

	public static void main(String[] args) {

		String str1 = "Testing";
		String str2 = "Selenium";

		str1 = str1 + str2;

		str2 = str1.substring(0, str2.length() - 1);
		str1 = str1.substring(str2.length());

		System.out.println(str1);
		System.out.println(str2);

	}

}
