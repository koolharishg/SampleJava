
public class SmallestAndLargestArray {

	public static void main(String[] args) {

		int a[] = { -1, 0, 1, 3, 44, 22, 55, 787, 5757 };

		int large = a[0];
		int small = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > large)
				large = a[i];
			else if (a[i] < small)
				small = a[i];
		}

		System.out.println("largest element is ->" + large);
		System.out.println("smallest element is ->" + small);

	}

}
