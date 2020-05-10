package Practice;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		// System.out.println(sum);
		int maxtotal = 5 * 6 / 2;
		System.out.println("missing number is -->" + (maxtotal - sum));
	}

}
