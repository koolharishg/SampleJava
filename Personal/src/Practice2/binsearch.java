package Practice2;

public class binsearch {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int x = 4;
		int start = 0;
		int len = a.length - 1;

		int result = searchbin(a, start, len, x);
		if (result == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("element found at index-->" + result);
		}

	}

	private static int searchbin(int[] a, int start, int len, int x) {

		if (len >= start) {

			int mid;

			mid = start + (len - start) / 2;

			if (a[mid] == x) {
				return mid;
			}

			if (a[mid] > x) {
				return searchbin(a, start, mid - 1, x);
			} else {
				return searchbin(a, mid + 1, len, x);
			}
		}

		return -1;
	}

}
