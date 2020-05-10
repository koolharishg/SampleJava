import java.util.Arrays;

public class ReverseWordsString {

	public static void main(String[] args) {

		String str = "Hello World";
		String str1[] = str.split(" ");

		for (int i = str1.length - 1; i >= 0; i--) {
			System.out.println(str1[i]);
		}

		// rotate array
		int a[] = { 1, 2, 3, 4, 5 };
		for (int j = 1; j <= 3; j++) {

			int last = a[a.length - 1];
			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}

			a[0] = last;
		}
		System.out.println(Arrays.toString(a));

		// separate 0 and 1

		int b[] = { 1, 0, 0, 1, 0, 0, 1, 1 };
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0)
				count++;
		}

		for (int i = 0; i < count; i++) {
			b[i] = 0;
		}
		for (int i = count; i < b.length; i++) {
			b[i] = 1;
		}

		System.out.println(Arrays.toString(b));

	}

}
