package Practice;

import java.util.Arrays;

public class SortArrayDescFreq {

	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 1, 6, 4, 3, 6, 4 };
		a = sort(a);

		System.out.println(Arrays.toString(a));
		int b[][] = new int[a.length][2];
		int x = 0;

		b[x][0] = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				System.out.println(b[x][1]);
				b[x][1] = b[x][1] + 1;
				System.out.println(b[x][1]);
			} else {
				x++;
				b[x][0] = a[i];
			}
		}
	}

	private static int[] sort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;

	}

}
