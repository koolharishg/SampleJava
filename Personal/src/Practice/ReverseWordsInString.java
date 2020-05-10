package Practice;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str = "It is Raining in Hyderabad";
		String arr[] = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
