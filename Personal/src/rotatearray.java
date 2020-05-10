
public class rotatearray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int x = a[a.length - 1], i;
		for (i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
			a[0] = x;
		}

		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}

}
