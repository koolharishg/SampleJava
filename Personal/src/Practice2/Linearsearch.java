package Practice2;

public class Linearsearch {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int x = 3;
		int flag = 0;
		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i] == x) {
				flag = 1;
				break;
			} else
				flag = 0;
		}
		if (flag == 1)
			System.out.println("element found at index-->" + i);
		else
			System.out.println("element not found");
	}

}
