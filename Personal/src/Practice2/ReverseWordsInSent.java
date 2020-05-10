package Practice2;

public class ReverseWordsInSent {

	public static void main(String[] args) {

		String str = "It is raining in Hyd";

		String arr[] = str.split(" ");
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i] + " ";

		}

		System.out.println(rev);
	}

}
