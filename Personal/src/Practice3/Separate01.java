package Practice3;

import java.util.Arrays;

public class Separate01 {

	public static void main(String[] args) {

		int a[] = { 1, 0, 1, 0, 1, 0 };
		int count = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == 0) {
				count++;
			}
		}

		for (int i = 0; i <= count; i++) {
			a[i] = 0;
		}

		for (int j = count; j <= a.length - 1; j++) {
			a[j] = 1;
		}

		System.out.println(Arrays.toString(a));

	}

}
