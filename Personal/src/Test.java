import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		for (int j = 0; j < 3; j++) {
			int last = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
		}
		System.out.println(Arrays.toString(arr));

	}
}