package Practice2;

import java.util.Arrays;

public class Separate01 {

	public static void main(String[] args) {
		int a[] = { 0, 1, 1, 1, 0, 0, 1 };

		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == 0)
				count++;
		}

		for (int i = 0; i < count; i++) {
			a[i] = 0;
		}

		for (int i = count; i < a.length; i++) {
			a[i] = 1;
		}

		System.out.println(Arrays.toString(a));

	}

}
