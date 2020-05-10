package Practice;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		for (int j = 1; j <= 3; j++) {
			int last = a[a.length - 1];

			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}

			a[0] = last;
		}
		System.out.println("rotated array is ->" + Arrays.toString(a));
	}

}
