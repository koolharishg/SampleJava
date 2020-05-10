package Practice3;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 5, 6, 7, 8 };

		int max = findMaxValue(a);
		int summax = max * (max + 1) / 2;
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		int missingnumber = 0;
		System.out.println("missing number is::" + (summax - total));
	}

	private static int findMaxValue(int[] a) {
		int maxvalue = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > maxvalue) {
				maxvalue = a[i];
			}
		}

		return maxvalue;
	}

}
