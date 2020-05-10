
//binary search: time complexity O(logn)
//linear search: time complexity O(n)

package Practice;

public class BinSearch {

	static int search(int[] a, int start, int i, int x) {

		if (i >= start) {
			int mid;
			mid = start + (i - start) / 2;

			if (a[mid] == x) {
				return mid;
			}

			if (a[mid] > x) {
				return search(a, start, mid - 1, x);
			} else {
				return search(a, mid + 1, i, x);
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int a[] = { 23, 45, 123, 342, 466, 868, 1082 };
		int len = a.length;
		int start = 0;
		int x = 1082;

		int result = search(a, start, len - 1, x);
		if (result == -1)
			System.out.println("element not present");
		else
			System.out.println("element found at index-->" + result);

	}

}
