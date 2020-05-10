public class SortArrayFrequency {

	static int x = 0;

	public static void main(String[] args) {

		int a[] = { 4, 3, 1, 6, 4, 3, 6, 4 };
		int b[][] = new int[a.length][2];

		a = sort(a);
		// [1, 3, 3, 4, 4, 4, 6, 6]

		b[x][0] = a[0];
		System.out.println(b[x][1]);
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				b[x][1] = b[x][1] + 1;

			} else {
				x++;
				b[x][0] = a[i];
			}
		}

	}

	public static int[] sort(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int t;
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}

}
