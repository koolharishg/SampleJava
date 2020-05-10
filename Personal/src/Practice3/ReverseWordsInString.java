package Practice3;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str = "Its raining in Hyderabad";

		String[] str2 = str.split(" ");

		for (int i = str2.length - 1; i >= 0; i--) {
			System.out.println(str2[i]);
		}

	}

}
