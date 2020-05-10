
public class Separate01 {

	public static void main(String[] args) {

		int a[] = { 1, 0, 0, 1, 0, 0, 1, 1 };

		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == 0)
				count++;
		}

		for (int i = 0; i < count; i++) {
			a[i] = 0;
		}

		for (int j = count; j < a.length; j++)
			a[j] = 1;

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

}
