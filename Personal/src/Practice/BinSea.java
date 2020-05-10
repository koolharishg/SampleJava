package Practice;

public class BinSea {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int len = a.length;
		int x = 8;
		int start = 0;

		int result = binseaa(a, start, len - 1, x);
		if (result == -1)
			System.out.println("element not present");
		else
			System.out.println("element present at index-->" + result);
	}

	private static int binseaa(int[] a, int start, int i, int x) {

		if (i >= start) {

			int mid;
			mid = start + (i - start) / 2;

			if (a[mid] == x) {
				return mid;
			}

			if (a[mid] > x) {
				return binseaa(a, start, mid - 1, x);
			} else {
				return binseaa(a, mid + 1, i, x);
			}

		}

		return -1;
	}

}
