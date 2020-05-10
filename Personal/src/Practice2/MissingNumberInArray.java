package Practice2;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5, 6, 7 };
		int max = getMax(a);
		max = max * (max + 1) / 2;
		int sum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			sum = sum + a[i];
		}

		System.out.println("missing values is " + (max - sum));
	}

	private static int getMax(int[] a) {

		int maxvalue = a[0];
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > maxvalue) {
				maxvalue = a[i];
			}
		}

		return maxvalue;
	}

}
