
public class MissingNumber {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5, 6 };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		int maxValue = getMaxValue(a);

		int sum2 = 6 * (6 + 1) / 2;
		System.out.println("missing bumber ->" + (sum2 - sum));

	}

	public static int getMaxValue(int[] inputarray) {
		int maxvalue = inputarray[0];
		for (int j = 0; j < inputarray.length; j++) {
			if (inputarray[j] > maxvalue) {
				maxvalue = inputarray[j];
			}
		}

		return maxvalue;
	}

}
