import java.util.Arrays;

public class SortArraySimplt {

	public static void main(String[] args) {

		int a[] = { 4, 3, 1, 6, 4, 3, 6, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
