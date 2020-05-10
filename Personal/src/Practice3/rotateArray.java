package Practice3;

import java.util.Arrays;

public class rotateArray {

	public static void main(String[] args) {
		// clock wise

		int a[] = { 1, 2, 3, 4, 5 };

//		int last = a[a.length - 1];
//
//		for (int i = a.length - 1; i > 0; i--) {
//			a[i] = a[i - 1];
//		}
//
//		a[0] = last;

//		System.out.println(Arrays.toString(a));

		// anti clock-wise

		int first = a[0];

		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}

		a[a.length - 1] = first;

		System.out.println(Arrays.toString(a));
	}

}
