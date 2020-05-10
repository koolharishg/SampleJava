package Practice;

public class binsearch1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int x = 10;
		int start = 0;
		int len = a.length;

		int result = searchindex(a, start, len - 1, x);
		if (result == -1) {
			System.out.println("element not found");

		} else {
			System.out.println("element found at index-->" + result);
		}

	}

	private static int searchindex(int[] a, int start, int i, int x) {

		if (i >= start) {

			int mid;
			mid = start + (i - start) / 2;

			if (a[mid] == x) {
				return mid;
			}

			if (a[mid] > x) {
				return searchindex(a, start, mid - 1, x);
			} else {
				return searchindex(a, mid + 1, i, x);
			}

		}

		return -1;

	}

}
