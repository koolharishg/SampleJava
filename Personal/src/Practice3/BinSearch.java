package Practice3;

public class BinSearch {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int start = 0;
		int len = a.length - 1;
		int x = 3;

		int result = binarySearch(a, start, len, x);
		if (result == -1)
			System.out.println("element not found");
		else
			System.out.println("element found at index::" + result);
	}

	private static int binarySearch(int[] a, int start, int len, int x) {

		if (len >= start) {

			int mid = start + (len - start) / 2;

			if (a[mid] == x) {
				return mid;
			}

			if (a[mid] > x)
				return binarySearch(a, start, mid - 1, x);
			else
				return binarySearch(a, mid + 1, len, x);

		}

		return -1;
	}

}
